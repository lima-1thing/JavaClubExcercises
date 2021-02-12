package com.codenext;

import com.codenext.util.Utils;

public class Main {

    public static void main(String[] args) {
        int[][] scores={
            {85,78,95},
            {95,98,95},
            {96,95,100},
            {98,89,90}
        };

        Utils.printArray(scores);
        System.out.println("Total of row 0: " + Utils.sum(scores[0]));
    }
}
