package com.mx.java10.featrues;

import java.util.List;

/*
java.util.List, java.util.Map and java.util.Set each got a new static method copyOf(Collection).
It returns the unmodifiable copy of the given Collection:
*/
public class CopyOf {

    public static void main(String[] args) {
        List someIntList = List.of(1,2,3,4,5);

        List<Integer> copyList = List.copyOf(someIntList);
        copyList.add(4); //java.lang.UnsupportedOperationException
    }
}
