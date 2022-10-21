package com.AlgorithmStuff;

import java.util.NoSuchElementException;

public class LinkedLists {
    private Node first, last;
    private int size;

    private static class Node {
        private final int value;
        private Node next;
        public Node(int val){
            this.value = val;
        }
    }

    public void addLast(int item){
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void deleteFirst(){
        if (first == null)
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void deleteLast(){
        if(first == null)
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else{
            last = getPrevious(last);
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){ return size; }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;

        while(current != null){
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        var previous = first;
        var current = first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthNodeFromEnd(int k){
        var second = first;
        var current = first;
        if (k > size || k < 0)
            throw new IllegalArgumentException();

        for(int i = 1; i <= k; i++){
            current = current.next;
        }

        while(current != null){
            second = second.next;
            current = current.next;
        }
        return second.value;
    }
}
