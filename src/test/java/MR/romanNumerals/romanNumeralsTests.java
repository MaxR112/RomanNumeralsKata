package MR.romanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.BeforeEach;

class romanNumeralsTests {
    public romanNumerals r;

    @BeforeEach
    public void setUp(){
        r = new romanNumerals();
    }

    @Test
    public void negativeIntegerIsAnError(){
        assertThrows(romanNumerals.NegativeIntegerException.class, 
                        () -> {r.convert(-1);});
    }

	@Test 
    public void testConvert1(){
        assertEquals("I", r.convert(1));
    }

    @Test
    public void testConvert2(){
        assertEquals("II", r.convert(2));
    }

    @Test
    public void testConvert3(){
        assertEquals("III", r.convert(3));
    }

    @Test
    public void testConvert10(){
        assertEquals("X", r.convert(10));
    }

    @Test
    public void testConvert24(){
        assertEquals("XXIV", r.convert(24));
    }

    @Test
    public void testConvert199(){
        assertEquals("CXCIX", r.convert(199));
    }

}
