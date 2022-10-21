package com.AlgorithmStuff;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedLists list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthNodeFromEnd(5));
    }
}


