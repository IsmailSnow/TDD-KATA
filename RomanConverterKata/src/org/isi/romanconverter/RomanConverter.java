package org.isi.romanconverter;


public class RomanConverter {


    public String convert(int input) {
        ResultBuilder result = new ResultBuilder(input);
        for(RomanLiteral item : RomanLiteral.literalsDecrementOrder()){
            input = result.compute(input, item);
        }
        return result.format();
    }

}
