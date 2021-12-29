package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String arr[] = {"Book1", "Book2", "Book3", "Book1", "Book2", "Book66", "Book22", "Book3", "Book4", "Book5", "Book6"};
        Set<String> set;
        Collections.addAll(set = new HashSet<String>(Arrays.asList(arr)));
        System.out.println(set);
        Collections.addAll(set = new TreeSet<String>(Arrays.asList(arr)));
        System.out.println(set);
    }
}
