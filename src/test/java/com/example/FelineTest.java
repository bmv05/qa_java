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
    Feline felineSpy;

    @Test
    public void felineEatMeatTypesOfFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void felinesEatMeatCallMethodGetFoodWithParameterPredator() throws Exception {
        this.felineSpy.eatMeat();
        Mockito.verify(this.felineSpy, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyReturnFeline() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturn1() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCallMethodGetKittensWithParameter1() {
        this.felineSpy.getKittens();
        Mockito.verify(this.felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensRandomTest() {
        Random random = new Random();
        Feline feline = new Feline();
        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(1001);
            assertEquals(value, feline.getKittens(value));
        }
    }
}
