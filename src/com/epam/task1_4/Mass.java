package com.epam.task1_4;

import java.util.Random;

public class Mass {
    int n;
    int[] mass;

    public Mass(int n, int[] mass) {
        this.n = n;
        this.mass = mass;
    }

    public int[] rand() {
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(1000);
        }
        return mass;
    }

    boolean checkNumber(int num) {
        boolean result = false;
        if (num <= 1)
            result = false;
        if (num == 2 || num == 3)
            result = true;
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    result = false;
                    break;
                } else
                    result = true;
            }
        }
        return result;
    }

    public void print() {
        rand();
        for (int k : mass) {
            System.out.println(k);
        }
        for (int i = 0; i < mass.length; i++) {
            if (checkNumber(mass[i])) {
                System.out.println("Number " + (i + 1) + " is simple");
            }
        }
    }
}
