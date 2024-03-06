package Computational.math.Tests;

import Computational.math.Methods.GoldenSection;
import Computational.math.Methods.HalfDivision;
import Computational.math.Utils.BeautyOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestHalfDivision {
    HalfDivision halfDivision = new HalfDivision(0,1,0.1f);
    GoldenSection goldenSection = new GoldenSection(0,1,0.1f);
    @Test
    public void solve(){
        halfDivision.solve();
        BeautyOutput.starsForTables();
        System.out.println();
//        goldenSection.solve();

    }
}
