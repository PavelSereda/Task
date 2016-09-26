package com.epam.task1_1;

public class Calculation {

    double x, y;

    public Calculation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculation() {
        double n;
        n = (1 + Math.pow((Math.sin(x + y)), 2)) / (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
        return n;
    }

}
