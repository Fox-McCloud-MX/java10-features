package com.mx.java10.featrues;

import java.util.List;
import java.util.stream.Collectors;

//java.util.stream.Collectors get additional methods to collect a Stream into unmodifiable List, Map or Set:
public class ToUnmodifiable {

    public static void main(String[] args) {

        List<Integer> someIntList = List.of(1,2,3,4,5); //int type isn't inferred

        List<Integer> evenList = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        evenList.add(4); //java.lang.UnsupportedOperationException
    }
}
