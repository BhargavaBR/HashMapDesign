package org.example;

public class MyHashMap {
    private static final int SIZE = 17;
    private Entry[] entries = new Entry[SIZE];

    public class Entry{
        private String key;
        private String value;
        private Entry next;
        public Entry(String key, String value){
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode()) % SIZE;

        if(entries[hash] != null){
            Entry e = entries[hash];
            while(e.next != null ){
                if(e.key.equals(key)){
                    e.value = value;
                    return;
                }
                e = e.next;
            }
            e.next = new Entry(key, value);
        }else{
            entries[hash] = new Entry(key, value);
        }
    }
    public Entry get(String key){
        int hash = Math.abs(key.hashCode()) % SIZE;
        Entry e = entries[hash];
        while(e != null){
            if(e.key.equals(key)) return e;
            e = e.next;
        }
        return null;
    }
}
