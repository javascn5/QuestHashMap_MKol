package com.sda.Day12;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    private Map<String, String> dictionary = new HashMap<String, String>();

    void addWord(String polish, String english){
        for(String key : dictionary.keySet()){
            if(polish.equals(key)){
                System.out.println("Słowo " + key + " wystepuje juz w slowniku!");
                return;
            }
        }
        dictionary.put(polish, english);
    }

    void show(){
        System.out.println("\nZawartosc slownika:");
        for(String key : dictionary.keySet()){
            System.out.println(key + " = " + dictionary.get(key));
        }
    }

    void getTranslation(String string){
        for(String key : dictionary.keySet()){
            if(string.equals(key)){
                System.out.println(key + " = " + dictionary.get(key));
            }
        }
        for(String key : dictionary.keySet()){
            if(string.equals(dictionary.get(key))){
                System.out.println(dictionary.get(key) + " = " + key);
            }
        }
    }

    //edytowanie tłumaczeń

    void edit(String polish, String english){       //key, value
        if(dictionary.containsKey(polish) || dictionary.containsValue(english)){
            dictionary.replace(polish, english);
        }
    }

    void remove(String key){
        if(dictionary.containsKey(key) || dictionary.containsValue(key)){
            dictionary.remove(key);
        }
    }
}
