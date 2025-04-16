package MR.romanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class romanNumeralsTests {
	@Test 
    public void testConvert1(){
        romanNumerals r = new romanNumerals();
        assertEquals("I", r.convert(1));
    }

    @Test
    public void testConvert2(){
        romanNumerals r = new romanNumerals();
        assertEquals("II", r.convert(2));
    }
}
