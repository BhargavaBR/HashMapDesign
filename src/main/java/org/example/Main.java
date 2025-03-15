package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        HashMap hashMap = new HashMap();
        hashMap.put("Karan","Boy");
        hashMap.put("Druti","Girl");
        hashMap.put("Bhargava","Boy");

        System.out.println("Druti is "+hashMap.getValue("Druti").getValue());

        MyHashMap map = new MyHashMap();
        map.put("Pradeep","DevOps");
        map.put("Bhargava","Software Developer");
        map.put("Sanketh","QA");

        System.out.println("Bhargava is a "+map.get("Bhargava").getValue()+" Engineer");
    }
}