package com.mx.java10.featrues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LocalVariableTypeInterface {

    //public var = "hello";                         // error: 'var' is not allowed here

    public static void main(String[] args) {
        var message = "Hello, Java 10";

        if (message instanceof String) {
            System.out.println("var message is instance of String");
        }

        //Map Declare
        Map<Integer, String> map = new HashMap<>();
        var idToNameMap = new HashMap<Integer, String>();

        //var n;                                    // error: cannot use 'var' on variable without initializer
        //var emptyList = null;                     // error: variable initializer is 'null'
        //var p = (String s) -> s.length() > 10;    // error: lambda expression needs an explicit target-type
        //var arr = { 1, 2, 3 };                    // error: array initializer needs an explicit target-type

        var empList1 = new ArrayList<>();
        var empList2 = new ArrayList<Employee>();

        var obj = new Object() {};
        System.out.println(obj.getClass().equals(Object.class));;
    }

    class Employee {

    }
}
