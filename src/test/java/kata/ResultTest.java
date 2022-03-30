package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result result = new Result(37);
        assertThat(result.number).isEqualTo("00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        assertNumberResult(0, "0");
        assertNumberResult(10, "10");
        assertNumberResult(30, "30");
        assertNumberResult(37, "00");
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertColorResult(1, Result.Color.GREEN);
        assertColorResult(15, Result.Color.GREEN);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        assertColorResult(4, Result.Color.BLACK);
        assertColorResult(12, Result.Color.BLACK);
        assertColorResult(34, Result.Color.BLACK);
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        assertColorResult(1, Result.Color.RED);
        assertColorResult(3, Result.Color.RED);
        assertColorResult(25, Result.Color.RED);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        RouletteException exception = assertThrows(
                RouletteException.class,
                () -> new Result(38)
        );
        assertEquals("Result can't be 38", exception.getMessage());


    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0(){
    RouletteException exception = assertThrows(RouletteException.class,
            () -> new Result(-1));
    assertEquals("Result can't be -1", exception.getMessage());

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}