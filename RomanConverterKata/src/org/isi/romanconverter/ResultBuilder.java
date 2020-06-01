package org.isi.romanconverter;

public class ResultBuilder {

    int rested;
    StringBuilder result = new StringBuilder();

    public ResultBuilder(int rested){
        super();
        this.rested = rested;
    }

    public void append(String str){
        result.append(str);
    }

    public String format() {
        return result.toString();
    }

    int compute(int input, RomanLiteral item) {
        while(input>=item.value){
            append(item.name());
            input -= item.value;
        }
        return input;
    }
}
