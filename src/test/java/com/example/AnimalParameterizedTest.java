package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    List<String> food;
    String animalKind;
    Animal animal;

    public AnimalParameterizedTest(String animalKind, List<String> food) {
        this.food = food;
        this.animalKind = animalKind;
        this.animal = new Animal();
    }

    @Parameterized.Parameters
    public static Object[][] listAnimal() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void checkFood() throws Exception {
        assertEquals(this.food, this.animal.getFood(this.animalKind));
    }
}
