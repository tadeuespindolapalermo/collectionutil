package com.github.tadeuespindolapalermo.collectionutil.app;

import com.github.tadeuespindolapalermo.collectionutil.util.CollectionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // removeElement();
        // collectionIsEmpty();
        // collectionIsNotEmpty();
        // getSizeCollection();
        mapToInteger();
    }

    private static void removeElement() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "PHP"));
        CollectionUtil.removeElement(words, Predicate.isEqual(words.get(1)));
        System.out.println(words);

        Predicate<String> filter = e -> e.startsWith("J");
        CollectionUtil.removeElement(words, filter);
        System.out.println(words);
    }

    private static void collectionIsEmpty() {
        List<String> wordsNotEmpty = new ArrayList<>(Arrays.asList("Java", "PHP"));
        System.out.println(CollectionUtil.collectionIsEmpty(wordsNotEmpty));

        List<String> wordsEmpty = new ArrayList<>(Arrays.asList());
        System.out.println(CollectionUtil.collectionIsEmpty(wordsEmpty));
    }

    private static void collectionIsNotEmpty() {
        List<String> wordsNotEmpty = new ArrayList<>(Arrays.asList("Java", "PHP"));
        System.out.println(CollectionUtil.collectionIsNotEmpty(wordsNotEmpty));

        List<String> wordsEmpty = new ArrayList<>(Arrays.asList());
        System.out.println(CollectionUtil.collectionIsNotEmpty(wordsEmpty));
    }

    private static void getSizeCollection() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "PHP"));

        System.out.println(CollectionUtil.getSizeCollection(words));
    }

    private static void mapToInteger() {
        List<String> numbersString = new ArrayList<>(Arrays.asList("Car", "45"));

        try {
            Collection<Integer> numbers = CollectionUtil.mapToInteger(numbersString);
            System.out.println(numbers);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao maperar valores!");
        }
    }
}
