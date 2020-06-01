package org.isi.romanconverter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum RomanLiteral {

      I(1),IV(4),V(5),IX(9),X(10),XL(40);
      public int value;
      private  RomanLiteral(int value){
          this.value=value;
      }

      public static List<RomanLiteral> literalsDecrementOrder(){
          List<RomanLiteral> literals = Arrays.asList(RomanLiteral.values());
          Collections.reverse(literals);
          return literals;
      }
}
