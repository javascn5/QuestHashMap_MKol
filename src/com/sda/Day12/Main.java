package com.sda.Day12;

public class Main {

    public static void main(String[] args) {
        HashMapClass dictionary = new HashMapClass();
        dictionary.addWord("kot", "cat");
        dictionary.addWord("pies", "dog");
        dictionary.addWord("kot", "cat");
        dictionary.addWord("śmigłowiec", "helicopter");


        dictionary.show();

        System.out.println("\nTlumaczenia:");
        dictionary.getTranslation("pies");
        dictionary.getTranslation("cat");
    }
}
