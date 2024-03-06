package Computational.math.Methods;

import org.junit.jupiter.api.Test;

public class MethodHord {
    private double a;
    private double b;
    private final float epsilon;


    public MethodHord(double a, double b, float epsilon) {
        this.a = a;
        this.b = b;
        this.epsilon = epsilon;
    }


    public void solve(){
        double x_volna,fx_volna = 0;
        double fb = 0;
        double fa = 0;
        double x_star,f_star = 0;
        int iter = 0;
        do {
            iter ++;
            x_volna = xVolna(a,b);
            fx_volna = f(x_volna);
            System.out.println(x_volna);
            System.out.println(fx_volna);
            if(Math.abs(fx_volna)<= epsilon){
                x_star = x_volna;
                f_star = fx_volna;
                break;
            }
            if(fx_volna > 0){
                b = x_volna;
                fb = fx_volna;
            }else{
                a = x_volna;
                fa = fx_volna;
            }
        }while (true);
        System.out.println("x_star= " + x_star + " f_star=" + f_star);
        System.out.println("iter =" + iter);
    }
    public double xVolna(double a,double b){
        double chislitel = f(a)*(a-b);
        double znamenatel = f(a) - f(b);
        return a - chislitel/znamenatel;
    }
    public double f(double x) {
        return Math.sqrt(1 + x * x) - Math.exp(-x);
    }
//    public double f (double x){
//        return Math.pow(x, 3) - 18 * x - 83;
//    }
}