package com.CodeWars;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        long d = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                d += 1;
            }
        }
        return d;
    }
}
