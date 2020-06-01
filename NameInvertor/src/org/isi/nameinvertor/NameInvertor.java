package org.isi.nameinvertor;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class NameInvertor {

    public static String invert(String str) {
        List<String> names = breakIntoPartignoringWhiteSpace(str);
        if(withoutHonorifics(names).size()<2){
            return withoutHonorifics(names).get(0);
        }
        return invert(withoutHonorifics(names));
    }

    private static List<String> withoutHonorifics(List<String> names) {
        names.removeIf(a-> isHonorifics(a));
        return names;
    }

    private static boolean isHonorifics(String s) {
        return s.equals(Honorifics.Mister) || s.equals(Honorifics.Madame) ;
    }

    private static List<String> breakIntoPartignoringWhiteSpace(String str) {
        return new LinkedList<String>(Arrays.asList(str.trim().split(regularExpressions.anyAmoutofWhiteSpace())));
    }

    private static String invert(List<String> names) {
        String first = names.get(0);
        String last = names.get(1);
        return String.format("%s, %s",last,first);
    }
}