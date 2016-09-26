package com.epam.task1_7;

public class Sort {
    double[] mass;

    public Sort(double[] mass) {
        this.mass = mass;
    }

    public double[] sort() {
        sortAlg(mass);
        for (double num : mass) {
            System.out.println(num);
        }
        return mass;
    }

    private void sortAlg(double[] arr) {
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] > arr[i + 1]) {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) i--; // сдвигаемся на 1 элемент назад
            } else if (i != arr.length - 1) i++; // сдвигаемся на 1 элемент вперёд
        }
    }
}