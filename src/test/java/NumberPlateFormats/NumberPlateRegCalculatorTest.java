package NumberPlateFormats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPlateRegCalculatorTest {

    @Test
    public void march_test(){
        //arrange
        String ageId = "04";
        String expected = "54";
        String actual;
        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();

        //act
        actual = calculator.ageCal(ageId);

        //assert
        assertEquals(expected,actual);
    }

//    @Test
//    public void september_test(){
//        //arrange
//        int ageId = 52;
//        int expected = 2002;
//        int actual;
//        NumberPlateRegCalculator calculator = new NumberPlateRegCalculator();
//
//        //act
//        actual = calculator.ageCal(ageId);
//
//        //assert
//        assertEquals(expected,actual);
//    }
}