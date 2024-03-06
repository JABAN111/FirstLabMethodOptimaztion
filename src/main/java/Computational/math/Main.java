package Computational.math;

import Computational.math.Methods.GoldenSection;
import Computational.math.Methods.HalfDivision;

public class Main {
    public static void main(String[] args) {
        GoldenSection gd = new GoldenSection(0d,1d,0.1f);
        HalfDivision halfDivision = new HalfDivision(0d,1d,0.1f);
        gd.solve();
        halfDivision.solve();
    }


}