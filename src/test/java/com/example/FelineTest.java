package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void felineEatMeatTypesOfFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), this.feline.eatMeat());
    }

    @Test
    public void felinesEatMeatCallMethodGetFoodWithParameterPredator() throws Exception {
        this.feline.eatMeat();
        Mockito.verify(this.feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyReturnFeline() {
        assertEquals("Кошачьи", this.feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturn1() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCallMethodGetKittensWithParameter1() {
        this.feline.getKittens();
        Mockito.verify(this.feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensRandomTest() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(1001);
            assertEquals(value, feline.getKittens(value));
        }
    }
}
