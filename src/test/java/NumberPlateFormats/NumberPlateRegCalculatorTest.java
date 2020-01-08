package NumberPlateFormats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPlateRegCalculatorTest {

    @Test
    public void march_test(){
        //arrange
        int ageId = 04;
        int expected = 2004;
        int actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }
}