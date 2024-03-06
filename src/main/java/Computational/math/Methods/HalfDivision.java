package Computational.math.Methods;

import Computational.math.Utils.BeautyOutput;

public class HalfDivision {
    double a; double b; float epsilon;
    public HalfDivision(double a,double b, float epsilon){
        this.a = a;
        this.b = b;
        this.epsilon = epsilon;
    }
    public void solve(){
        BeautyOutput.starsForTables();
        System.out.println();
        int iter = 0;
        while ((b - a > 2*epsilon)) {
            iter++;
            //стартовое
            double x1 = (a + b - epsilon) / 2;
            double x2 = (a + b + epsilon) / 2;
            double y1 = givenFunction(x1);
            double y2 = givenFunction(x2);
            if(y1 > y2){
                this.a = x1;
            }else{
                this.b = x2;
            }
            System.out.println("irer = " + iter + " x1 = " + String.format("%.3f",x1) + " x2 =" + String.format("%.3f",x2) + " y1 =" + String.format("%.3f",y1) + " y2=" + String.format("%.3f",y2));
        }
        BeautyOutput.starsForTables();
        double xm = (a + b) / 2;
        double ym = givenFunction(xm);
        System.out.println();
        System.out.println("final: iter = " + iter + " xm = " + String.format("%.3f",xm) + " ym = " + String.format("%.3f",ym));
        System.out.println("("+xm +","+givenFunction(xm)+")");
    }

    public double givenFunction(double x){
        return Math.sqrt(1+x*x) - Math.exp(-x);
    }

}
