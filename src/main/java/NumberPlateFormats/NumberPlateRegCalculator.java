package NumberPlateFormats;

import java.time.Instant;
import java.time.Year;
import java.util.Calendar;

public class NumberPlateRegCalculator {

    public String ageCal(String ageId) {
        if(Integer.valueOf(ageId) >= 0) {
            if (Integer.valueOf(ageId) < 51) {
                return Integer.toString(Integer.valueOf(ageId) + 50);
            }
            if (Integer.valueOf(ageId) > 51) {
                if ((Integer.valueOf(ageId) - 49) < 10) {
                    return "0" + (Integer.valueOf(ageId) - 49);
                }
                return Integer.toString(Integer.valueOf(ageId) - 49);
            }
        }
        return "Negative Number";
    }
}
