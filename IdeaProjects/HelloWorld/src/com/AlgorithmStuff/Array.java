package com.AlgorithmStuff;

public class Array {
    private int length;
    private int[] array;
    private int count;

    Array (int l){
        this.length = l;
        this.array = new int[this.length];
    }

    public void insert(int item){
        if (this.array.length == count){
            int[] new_array = new int[count * 2];
            for(int i = 0; i < this.count; i++){
                new_array[i] = this.array[i];
            }
            this.array = new_array;
        }
        this.array[count++] = item;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i < this.count - 1; i++){
            this.array[i] = this.array[i + 1];
        }
        this.count -= 1;
    }

    public int indexOf(int num){
        for(int i = 0; i < this.count; i++){
            if (this.array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i < this.count; i++){
            System.out.println(this.array[i]);
        }
    }

    public int max(){
        int maximum = array[0];
        for (int value : array) {
            if (value > maximum)
                maximum = value;
        }
        return maximum;
    }

    public int[] intersect(int[] array_two){
        int count = 0;
        for(int value : array_two){
            for (int val : array){
                if (val == value)
                    count += 1;
            }
        }
        int[] common = new int[count];
        int position = 0;
        for(int value : array_two){
            for (int val : array){
                if (val == value){
                    common[position] = value;
                    position++;
                }
            }
        }
        return common;
    }

    public int[] reverse(){
        int[] reversed = new int[array.length];
        int position = 0;

        for(int value: array){
            reversed[position] = value;
            position += 1;
        }
        return reversed;
    }

    public void insertAt(int item, int index){
        int[] new_array = new int[array.length + 1];
        int position = 0;

        new_array[index] = item;
        for(int i = 0; i < index; i++)
            new_array[position] = array[i];
        System.arraycopy(array, index, new_array, index + 1, array.length - index);
        array = new_array;
    }
}
