package com.mx.java10.featrues;

import java.util.List;

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        List<Integer> someIntList = List.of(1,2,3,4,5); //int type isn't inferred

        Integer firstEven = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();

        if((firstEven).equals(Integer.valueOf(2))) {
            System.out.println("firstEven is equals");
        }

    }
}
