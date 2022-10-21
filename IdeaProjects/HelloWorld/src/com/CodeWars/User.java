package com.CodeWars;

public class User {
    public int rank, progress;
    public final int[] rankings = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};

    public User(){
        rank = -8;
        progress = 0;
    }

    public int progress(){
        return progress;
    }
    public int rank(){
        return rank;
    }

    public int indexInRankings(int val){
        for(int i = 0; i < rankings.length; i++){
            if(rankings[i] == val)
                return i;
        }
        return -1;
    }


    public void incProgress(int r) {
        if(r == 0 || r > 8 || r < -8) throw new IllegalArgumentException();
        int difference = indexInRankings(r) - indexInRankings(rank);
        System.out.println(difference);
        if (difference == 0) {
            progress += 3;
        } else if (rank - 1 == r) {
            progress += 1;
        } else if (r > rank) {
            progress += 10 * Math.pow(difference, 2);
        }
        else {
            progress += 0;
        }

        if (progress >= 100 && rank != 8) {
            rank = rankings[indexInRankings(rank) + (progress / 100)];
            progress %= 100;
        }
    }

    public static void main(String[] args){
        User me = new User();
        me.incProgress(3);
        System.out.println(me.rank());
        System.out.println(me.progress());
    }
}
