package org.isi.caracterinstring;


public class CharacterInString {

    private final String str;

    public CharacterInString(String input){
        this.str=input;
    }

    public int counter(char given) {
        int counter =0 ;
        for(int i=0;i< str.length();i++){
            if(str.charAt(i) == given){
                counter++;
            }
        }
        return counter;
    }
}
