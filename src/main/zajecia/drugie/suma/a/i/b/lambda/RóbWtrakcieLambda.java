package zajecia.drugie.suma.a.i.b.lambda;

import zajecia.drugie.suma.a.i.b.kalsycznie.Suma;
import zajecia.drugie.suma.a.i.b.lambda.interfejs.SumaLambda;

public class RóbWtrakcieLambda {

    private int suma = 0;
    private SumaLambda sumaLambda = (a,b) -> {
        int i = a;
        do {
            suma += i;
            i++ ;
        }
        while (i<=b);
        System.out.println(suma);
        return suma;
    };

    public SumaLambda getSumaLambda() {
        return sumaLambda;
    }
}
