package Computational.math.Tests;

import Computational.math.Methods.MethodHord;
import org.junit.jupiter.api.Test;

public class TestMethodChord {

    @Test
    public void solveT() {
        MethodHord methodHord = new MethodHord(0,1,0.1f);
//        methodHord.solve();
        System.out.println(methodHord.f(1));
    }

}
