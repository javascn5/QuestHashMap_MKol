package com.sda.Day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapClass {

    private Map<String, String> dictionary = new HashMap<String, String>();

    void addWord(String polish, String english) {
        if (polish.trim().length() == 0 || english.trim().length() == 0) {
            System.out.println("Podano zbyt krotkie slowo!");
            return;
        }

        for (String key : dictionary.keySet()) {
            if (polish.equals(key)) {
                System.out.println("Słowo " + key + " wystepuje juz w slowniku!");
                return;
            }
        }
        dictionary.put(polish, english);
    }

    void show() {
        System.out.println("\nZawartosc slownika:");
        for (String key : dictionary.keySet()) {
            System.out.println(key + " = " + dictionary.get(key));
        }
    }

    void getTranslation(String string) {
        for (String key : dictionary.keySet()) {
            if (string.equals(key)) {
                System.out.println(key + " = " + dictionary.get(key));
            }
        }
        for (String key : dictionary.keySet()) {
            if (string.equals(dictionary.get(key))) {
                System.out.println(dictionary.get(key) + " = " + key);
            }
        }
    }

    //edytowanie tłumaczeń

    void edit(String oldPolish, String polish, String english) {       //key, value
        if (dictionary.containsKey(polish)) {
            dictionary.replace(polish, english);
        }

        if (dictionary.containsValue(english)) {
            dictionary.remove(oldPolish);
            addWord(polish, english);
        }
    }

    void remove(String key) {
        if (dictionary.containsKey(key) || dictionary.containsValue(key)) {
            dictionary.remove(key);
        }
    }

    List<String> getAllPl() {
        return new ArrayList<>(dictionary.keySet());        //wyciągamy listę kluczy, przekazujemy do konstruktora ArrayList i zwracamy
    }

    List<String> getAllTranslations() {
        return new ArrayList<>(dictionary.values());        //wyciągamy listę kluczy, przekazujemy do konstruktora ArrayList i zwracamy
    }
}
