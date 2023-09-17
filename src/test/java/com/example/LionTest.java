package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)


public class LionTest {
    Lion lion;
    boolean hasMane;
    List<String> food;

    public LionTest(String sex, boolean hasMane, List<String> food) throws Exception {
        this.hasMane = hasMane;
        this.food = food;
        this.lion = new Lion(sex, new Feline());
    }

    @Parameterized.Parameters
    public static Object[][] listMale() {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        return new Object[][]{
                {"Самец", true, food},
                {"Самка", false, food}
        };
    }
    @Test
    public void getKittensReturn1() {
        assertEquals(1, this.lion.getKittens());
    }

    @Test
    public void doesLionHaveMane() {
        assertEquals(this.hasMane, this.lion.doesHaveMane());
    }

    @Test
    public void getFood() {
        try {
            assertEquals(this.food, this.lion.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void constructorCatchException() {
        try {
            new Lion("Error", new Feline());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}


