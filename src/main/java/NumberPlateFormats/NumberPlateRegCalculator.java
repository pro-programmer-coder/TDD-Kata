package NumberPlateFormats;

import java.time.Instant;
import java.time.Year;
import java.util.Calendar;

public class NumberPlateRegCalculator {

    public String ageCal(String ageId) {
        return Integer.toString(Integer.valueOf(ageId) + 50);
    }
}
