package com.Shreyas;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> getListOfFactors(int number)
    {
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                firstArray.add(i);
        }
        return firstArray;
    }

    public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums)
    {
        // you must call getListOfFactors() in this method
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        for (Integer num : nums) {
            secondArray.addAll(getListOfFactors(num));
        }
        for (int j = nums.size() - 1; j >= 0; j--)
        {
            int count = 0;
            for (int h = 2; h < nums.size() - 1; h++)
            {
                if (secondArray.get(j) % h == 0)
                    count++;
            }
            if (count == 0)
                secondArray.remove(j);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(7);
        test.add(17);
        keepOnlyCompositeNumbers(test);
        System.out.println(test);
    }
}
