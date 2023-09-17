import com.example.Feline;
import org.junit.Test;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
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
