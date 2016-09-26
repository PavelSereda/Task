package com.epam.task1_3;

public class Function {

    double a;
    double b;
    double h;

    public Function(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int function() {
        for (double i = a; i <= b ; i += h) {
            if((h==0) || (a==0) || (b==0) ||((b-a)<0 ||((b-a<=0))) ){
                System.out.println("Error");return 0;}
            System.out.print(i + " ");
            System.out.println(Math.tan(i));
        }
        return 1;
    }


}
