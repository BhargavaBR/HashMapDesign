package org.example;

public class HashMap {
    public static final int SIZE = 31;
    public Entry[] entries = new Entry[SIZE];

    public class Entry{
        private String key;
        private String value;
        private Entry next;

        public Entry(String key, String value){
            this.key = key;
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
    public Entry getValue(String key){
        int hash = Math.abs(key.hashCode()) % SIZE;
        Entry e = entries[hash];
        if(e!=null){
            while (e.key.equals(key)) {
                return e;
            }
        }
        return null;
    }
    public void put(String key, String value){
        int hash = Math.abs(key.hashCode()) % SIZE;
        Entry e = entries[hash];
        if(e!=null){

                while(e.next != null){
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
}
