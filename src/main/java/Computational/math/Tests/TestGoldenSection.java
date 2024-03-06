package Computational.math.Tests;

import Computational.math.Methods.GoldenSection;
import org.junit.jupiter.api.Test;

public class TestGoldenSection {
    @Test
    public void testSolve(){
//        GoldenSection goldenSection = new GoldenSection(0d,1d,0.01f);
//        goldenSection.solve();
        GoldenSection gd = new GoldenSection(0d,1d,0.1f);
        System.out.println(String.format("%.3f",gd.f(0.0105)));
//        gd.Ssolve();
    }
    @Test
    public void testSsolve(){
//        GoldenSection goldenSection = new GoldenSection(0d,1d,0.01f);
//        goldenSection.solve();
        GoldenSection gd = new GoldenSection(0d,1d,0.1f);
//        System.out.println(String.format("%.3f",gd.f(0.146)));
        gd.solve();
    }
    @Test
    public  void dumbTest(){
        double f1 = 0.021;
        double f2 = 0.056;
        System.out.println(f2>f1);
    }
}
