import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Project6.RestCalculation;

public class RestCalculationTest {
    @Test
    public void testNumberMonths() {
        RestCalculation service = new RestCalculation();
        int expected = 2;
        int actual = service.calcRest(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

}
