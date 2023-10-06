import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Project6.RestCalculation;

public class RestCalculationTest {

    @Test
    public void testNumberMonths (){
        RestCalculation service = new RestCalculation();
         int expected = 3;
         int actual = service.calcRest(10000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }
}
