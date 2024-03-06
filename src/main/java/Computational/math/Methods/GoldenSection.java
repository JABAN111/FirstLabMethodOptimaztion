package Computational.math.Methods;

import Computational.math.Utils.BeautyOutput;

public class GoldenSection {
    private double a;
    private double b;
    private final float epsilon;


    public GoldenSection(double a, double b, float epsilon) {
        this.a = a;
        this.b = b;
        this.epsilon = epsilon;
    }

    public void solve() {
        double x1, x2,f1,f2;
        int iter = 0;
        BeautyOutput.starsForTables();
        x1 = a + 0.382 * (b - a);
        x2 = a + 0.618 * (b - a);
        f1 = f(x1);
        f2 = f(x2);
        while (!(Math.abs(b - a) < epsilon)) {
            iter++;
            System.out.println(Math.abs(b-a));
            System.out.println("irer = " + iter + " x1 = " + String.format("%.3f", x1) + " x2 =" + String.format("%.3f", x2) + " f1 =" + String.format("%.3f", f(x1)) + " f2=" + String.format("%.3f", f(x2)));
            if (f1>= f2) {
                a = x1;
                //for next iter
                x1 = x2;
                x2 = a + 0.618 *(b-x1);
                f1 = f2;
                f2 = f(x2);
            } else {
                b = x2;
                //for next iter
                x2 = x1;
                x1 = a + 0.382 * (x2 - a);
                f2 = f1;
                f1 = f(x1);
            }
        }

        BeautyOutput.starsForTables();

        double xm = (a + b) / 2;
        System.out.println("a=" + a);
        System.out.println("b = " + b);
        System.out.println("a+b = " + a + b);
        System.out.println("xm = " + xm);
        System.out.println("Ssolve Метод золотого сечения\t" + "(" + xm + "," + givenFunction(xm) + ")");
    }

    public double givenFunction(double x) {
        return Math.sqrt(1 + x * x) - Math.exp(-x);
    }

    public double f(double x) {
        return Math.sqrt(1 + x * x) - Math.exp(-x);
    }
}
