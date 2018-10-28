package com.sda.Day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        HashMapClass dictionary = new HashMapClass();
//        dictionary.addWord("kot", "cat");
//        dictionary.addWord("pies", "dog");
//        dictionary.addWord("kot", "cat");
//        dictionary.addWord("śmigłowiec", "helicopter");
//        dictionary.addWord("silnik", "engine");
//        dictionary.addWord("silnik", "");
//        dictionary.addWord(" ", "engi");
//
//
//        dictionary.show();
//
//        System.out.println("\nTlumaczenia:");
//        dictionary.getTranslation("pies");
//        dictionary.getTranslation("cat");
//
//        dictionary.edit("pies","pieseł", "dog");
//        dictionary.edit("kot", "kot", "catty");
//
//        dictionary.show();
//
//        dictionary.remove("kot");
//
//        dictionary.show();
//
//        System.out.println("All: " + dictionary.getAllPl());
//        System.out.println("All translations: " + dictionary.getAllTranslations());

        MultiTranslation multiDictionary = new MultiTranslation();
        ArrayList<String> englishTrs = new ArrayList<>();

        multiDictionary.addWord("owoc", Arrays.asList("fruit", "frujot"));
        multiDictionary.addWord("pies", Arrays.asList("dog", "goggy", "piston"));
        multiDictionary.addWord("krowa", Arrays.asList("cow", "cowboy"));
        multiDictionary.addWord("miecz", Arrays.asList("excaliboor", "mahajta"));

        System.out.println("All pl: " + multiDictionary.getAllPl());

        System.out.println("owoc = " + multiDictionary.getEnglishTranslation("owoc"));

        multiDictionary.show();

        multiDictionary.remove("miecz");

        multiDictionary.show();

        multiDictionary.edit("owoc", "owoc", Arrays.asList("fruitos", "owoczan", "kaban", "orzech"));

        multiDictionary.show();

        multiDictionary.edit("owoc", "owocek", Arrays.asList("fruitos"));

        multiDictionary.show();
    }
}
