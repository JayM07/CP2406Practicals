package com.example.CP2406Practicals;

public class CollatzSequence {
    public static void main(String[] args) {
        int N;
        System.out.print("Type any positive integer: ");
        N = TextIO.getlnInt();
        while (N!=1) {
            if (N%2 ==0){
                 N=N/2;
            }
            else {
                N = 3*N +1;
            }
            System.out.println(N);

        }
    }
}
