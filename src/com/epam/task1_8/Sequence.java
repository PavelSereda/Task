package com.epam.task1_8;


import java.util.Arrays;

public class Sequence {

    double[] mass1;
    double[] mass2;
    int counter = 0;

    public Sequence(double[] mass1, double[] mass2) {
        this.mass1 = mass1;
        this.mass2 = mass2;
    }


    public void beforeMass() {
        Arrays.sort(mass2);
        for (int i = 0; i < mass2.length; i++) {
            if (mass1[0] > mass2[i]) {
                System.out.println("We can paste " + mass2[i] + " on the " + (i + 1) + " place.");
                counter++;
            }
        }
    }

    public void insideMass() {
        for (int i = 0; i < mass1.length - 1; i++) {
            if (mass1[i + 1] - mass1[i] >= 0) {
                for (int j = 0; j < mass2.length; j++) {
                    if ((mass2[j] >= mass1[i]) && (mass2[j] <= mass1[i + 1])) {
                        System.out.println("Paste " + mass2[j] + " after " + mass1[i] + " and..");
                        counter++;
                    }
                }
            }
        }
    }



    public int getCounter() {
        return counter;
    }


}
