package com.epam.task1_8;

public class MainClass {
    public static void main(String[] args) {
        double[] mass1 = new double[]{1, 3, 4};
        double[] mass2 = new double[]{0, 2, 3};
        Sequence s = new Sequence(mass1, mass2);
        s.beforeMass();
        s.insideMass();
    }
}
