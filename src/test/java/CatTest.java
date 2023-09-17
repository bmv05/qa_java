import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnValueFromEatMeat() {
        List<String> listOfFood = List.of("Грибы", "Огурцы", "Рыба");
        try {
            Mockito.when(this.feline.eatMeat()).thenReturn(listOfFood);
            Cat cat = new Cat(this.feline);
            assertEquals(listOfFood, cat.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
