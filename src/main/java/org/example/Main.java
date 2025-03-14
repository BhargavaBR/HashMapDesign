package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        HashMap hashMap = new HashMap();
        hashMap.put("Karan","Boy");
        hashMap.put("Druti","Girl");
        hashMap.put("Bhargava","Boy");

        System.out.println("Druti is "+hashMap.getValue("Druti").getValue());
    }
}