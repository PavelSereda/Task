package com.epam.task1_5;


public class MainClass {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 4};
        int n = a.length;
        int[] d = new int[n];
        Matrix m = new Matrix(a, n, d);
        m.minCount();

    }
}
