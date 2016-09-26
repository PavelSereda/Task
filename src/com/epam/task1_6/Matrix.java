package com.epam.task1_6;

public class Matrix {

    public int[] left(int a[], int n) { //функция смещение на 1 влево
        int temp = a[0];
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = temp;
        return a;
    }

    public void createMass() {
        int[] n = new int[]{2, 0, 4, 3, 5};
        int[][] matrix = new int[n.length][n.length];


        for (int i = 0; i < n.length; i++) {
            matrix[i] = n.clone();
            n = left(n, n.length);
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
    }
}
