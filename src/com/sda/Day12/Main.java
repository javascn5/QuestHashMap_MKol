package com.sda.Day12;

public class Main {

    public static void main(String[] args) {
        HashMapClass dictionary = new HashMapClass();
        dictionary.addWord("kot", "cat");
        dictionary.addWord("pies", "dog");
        dictionary.addWord("kot", "cat");
        dictionary.addWord("śmigłowiec", "helicopter");
        dictionary.addWord("silnik", "engine");
        dictionary.addWord("silnik", "");
        dictionary.addWord(" ", "engi");


        dictionary.show();

        System.out.println("\nTlumaczenia:");
        dictionary.getTranslation("pies");
        dictionary.getTranslation("cat");

        dictionary.edit("pies","pieseł", "dog");
        dictionary.edit("kot", "kot", "catty");

        dictionary.show();

        dictionary.remove("kot");

        dictionary.show();

        System.out.println("All: " + dictionary.getAllPl());
        System.out.println("All translations: " + dictionary.getAllTranslations());

    }
}
