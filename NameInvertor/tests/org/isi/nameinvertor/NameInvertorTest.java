package org.isi.nameinvertor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class NameInvertorTest {

    @Test()
    @DisplayName("Test assert exception")
    public void invertShouldThrowNullPointException(){
        assertThrows(NullPointerException.class,()->NameInvertor.invert(null));
    }

    @Test()
    @DisplayName("Test assert empty string")
    public void invertShouldReturnEmptyStringIfEmpty(){
    assertEquals("",NameInvertor.invert(""));
    }

    @Test()
    @DisplayName("Test assert blank string")
    public void invertShouldReturnBlankStringIfEmpty(){
        assertEquals("",NameInvertor.invert(""));
    }

    @Test()
    @DisplayName("Test assert invert firstname")
    public void invertShouldReturnNameStringIfFirstName(){
        assertEquals("ismail",NameInvertor.invert("ismail"));
    }

    @Test()
    @DisplayName("Test assert invert comma first")
    public void invertShouldReturnlastCommoFirst(){
        assertEquals("salmi, ismail",NameInvertor.invert("ismail salmi"));
    }

    @Test()
    @DisplayName("Test assert invert comma first multple space")
    public void invertShouldReturnlastCommoFirstMultupleSpace(){
        assertEquals("salmi, ismail",NameInvertor.invert("ismail     salmi"));
    }

    @Test()
    @DisplayName("Test assert invert honorific snames")
    public void invertShouldReturnLasrAsWellForHonorificsName(){
        assertEquals("salmi, ismail",NameInvertor.invert("Mr. ismail     salmi"));
        assertEquals("salmi, houda",NameInvertor.invert("Mrs. houda     salmi"));
        assertEquals("salmi, houda",NameInvertor.invert("Mrs. houda     salmi Sr. Phd."));
    }

}