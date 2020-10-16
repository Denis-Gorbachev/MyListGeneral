package com.company;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Randomizer.randomString(myList, 10);
        System.out.println(myList);
        myList.swap(0, 3);
        System.out.println(myList);
        MyList <Integer> myList2  = new MyList<>((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Randomizer.randomInteger(myList2, 10);
        System.out.println(myList2);
        myList2.swap(0, 4);
        System.out.println(myList2);
    }
}
