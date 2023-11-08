import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    @Test
    public void getFoodReturnsCorrectFoodForCat() throws Exception {
        // Arrange
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockFeline);
        // Act
        List<String> actual = cat.getFood();
        // Assert
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getSoundReturnsCorrectSound() {
        // Arrange
        Feline mockFeline = mock(Feline.class);
        Cat cat = new Cat(mockFeline);
        // Act
        String sound = cat.getSound();
        // Assert
        assertEquals("Мяу", sound);
    }
}