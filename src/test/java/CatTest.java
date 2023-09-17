import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void getSoundTest(){
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest(){
        Cat cat = new Cat(new Feline());
        try {
            assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
