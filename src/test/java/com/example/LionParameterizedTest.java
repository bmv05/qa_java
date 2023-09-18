package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    Lion lion;
    boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) throws Exception {
        this.hasMane = hasMane;
        this.lion = new Lion(sex, new Feline());
    }

    @Parameterized.Parameters
    public static Object[][] listMale() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesLionHaveMane() {
        assertEquals(this.hasMane, this.lion.doesHaveMane());
    }
}


