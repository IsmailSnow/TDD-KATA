package org.isi.primerefactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeRefactor {
    public static List<Integer> of(int n) {
        List<Integer> result = new ArrayList<>();
        for(int divisor=2;n>1;divisor++)
          for(;n % divisor == 0;n /= divisor)
              result.add(divisor);
        return result;
    }
}
