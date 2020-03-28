import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {



    @Test
    public void shouldEvaluateConstants() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.evaluate("1");
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldSupportAdding() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.evaluate("2 + 2");
        //then
        assertEquals(4, result);
    }

    @Test
    public void shouldSupportSubtracting() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.evaluate("4 - 1");
        //then
        assertEquals(3, result);
    }

    @Test
    public void shouldComputeComplexStatements() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.evaluate("1 + 2 - 1 + 5");
        //then
        assertEquals(7, result);
    }
}
