package com.github.tadeuespindolapalermo.collectionutil.util;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionUtil {

    private CollectionUtil() {}

    public static boolean removeElement(Collection<String> collection, Predicate<String> filter) {
        return collection.removeIf(filter);
    }

    public static boolean collectionIsEmpty(Collection<?> collection) {
        return collection.isEmpty();
    }

    public static boolean collectionIsNotEmpty(Collection<?> collection) {
        return !collectionIsEmpty(collection);
    }

    public static int getSizeCollection(Collection<?> collection) {
        return collection.size();
    }

    public static Collection<Integer> mapToInteger(Collection<String> collection) {
        return collection.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

}
