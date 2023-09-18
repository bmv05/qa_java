package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LionTest {
    Lion lion;

    public LionTest() throws Exception {
        this.lion = new Lion("Самец", new Feline());
    }

    @Test
    public void getKittensReturn1() {
        assertEquals(1, this.lion.getKittens());
    }

    @Test
    public void getFood() {
        try {
            assertEquals(List.of("Животные", "Птицы", "Рыба"), this.lion.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void constructorCatchException() {
        try {
            new Lion("Error", new Feline());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}


