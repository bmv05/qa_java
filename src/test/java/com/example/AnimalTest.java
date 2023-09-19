package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void checkExceptionGetFoof() {
        Animal animal = new Animal();
        try {
            animal.getFood("Error");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void checkDefaultFamily() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
