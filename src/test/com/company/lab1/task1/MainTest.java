package test.com.company.lab1.task1;

import main.com.company.lab1.task1.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void givenTwoValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = 1, y = -1;
        double expected = 1.5;
        double actual = Main.calculate(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoPositiveValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = 2, y = 2;
        double expected = 2.4177617232402064;
        double actual = Main.calculate(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoNegativeValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = -2, y = -2;
        double expected = -1.5822382767597936;
        double actual = Main.calculate(x, y);
        assertEquals(expected, actual);
    }
}