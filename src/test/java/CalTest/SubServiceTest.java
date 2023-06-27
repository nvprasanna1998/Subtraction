package CalTest;
import com.Program.Service.SubService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubServiceTest {

    @Test
    public void testSubNumbers() {
        int a = 10;
        int b = 5;
        int expected = 5;

        int result = SubService.subNumbers(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers()
    {
        int a = 6;
        int b = -8;

        int expected = 14;
        int result = SubService.subNumbers(a, b);
        assertEquals(expected, result);

    }

}
