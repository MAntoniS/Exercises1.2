package zajecia.drugie.suma.a.i.b.lambda;

import zajecia.drugie.suma.a.i.b.kalsycznie.Suma;
import zajecia.drugie.suma.a.i.b.lambda.interfejs.SumaLambda;

public class DLam  {
      private int suma = 0;
      private SumaLambda dlaLam = (s, d) -> {
        for (int i = s; i <= d; i++) {
            suma += i;
        };
        System.out.println(suma);
    return suma;
    };

    public SumaLambda getDlaLam() {
        return dlaLam;
    }
}
