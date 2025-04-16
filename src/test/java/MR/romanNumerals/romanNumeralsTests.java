package MR.romanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
