package NumberPlateFormats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPlateRegCalculatorTest {

    @Test
    public void march_test(){
        //arrange
        String ageId = "05";
        String expected = "55";
        String actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void sept_test(){
        //arrange
        String ageId = "77";
        String expected = "28";
        String actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void negative_number(){
        //arrange
        String ageId = "-5";
        String expected = "Negative Number";
        String actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void zero_test(){
        //arrange
        String ageId = "-5";
        String expected = "Negative Number";
        String actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }

}