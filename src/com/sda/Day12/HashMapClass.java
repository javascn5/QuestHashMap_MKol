package com.sda.Day12;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    private String polish;
    private String english;

    private Map<String, String> dictionary = new HashMap<String, String>();

    public void addWord(String polish, String english){
        for(String key : dictionary.keySet()){
            if(polish.equals(key) || english.equals(dictionary.keySet())){
                System.out.println("Słowo " + key + " wystepuje juz w slowniku!");
                return;
            }
        }
        dictionary.put(polish, english);
    }

    public void show(){
        System.out.println("\nZawartosc slownika:");
        for(String key : dictionary.keySet()){
            System.out.println(key + " = " + dictionary.get(key));
        }
    }
}
