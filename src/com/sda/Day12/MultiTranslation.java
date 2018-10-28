package com.sda.Day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiTranslation {

    private Map<String, List<String>> multiDictionary = new HashMap<String, List<String>>();

    void addWord(String polish, List<String> english) {
        if (polish.trim().length() == 0 || english.size() == 0) {
            System.out.println("Podano zbyt krotkie slowo!");
            return;
        }

        for (String key : multiDictionary.keySet()) {
            if (polish.equals(key)) {
                System.out.println("Słowo " + key + " wystepuje juz w slowniku!");
                return;
            }
        }
        multiDictionary.put(polish, english);
    }

    void show() {
        System.out.println("\nZawartosc slownika:");
        for (String key : multiDictionary.keySet()) {
            System.out.println(key + " = " + multiDictionary.get(key));
        }
    }

    void getTranslation(String string) {
        for (String key : multiDictionary.keySet()) {
            if (string.equals(key)) {
                System.out.println(key + " = " + multiDictionary.get(key));
            }
        }
        for (String key : multiDictionary.keySet()) {
            if (string.equals(multiDictionary.get(key))) {
                System.out.println(multiDictionary.get(key) + " = " + key);
            }
        }
    }

    void remove(String key) {
        if (multiDictionary.containsKey(key) || multiDictionary.containsValue(key)) {
            multiDictionary.remove(key);
        }
    }

    void edit(String oldPolish, String polish, List<String> english) {       //key, value
        if (multiDictionary.containsKey(oldPolish)) {
            multiDictionary.replace(polish, english);
        }

        if (multiDictionary.containsValue(english)) {
            multiDictionary.remove(oldPolish);
            addWord(polish, english);
        }
    }

    List<String> getAllPl() {
        return new ArrayList<>(multiDictionary.keySet());        //wyciągamy listę kluczy, przekazujemy do konstruktora ArrayList i zwracamy
    }

    List<String> getEnglishTranslation(String polish){
        return multiDictionary.get(polish);
    }

}
