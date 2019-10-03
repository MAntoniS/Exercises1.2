package zajecia.drugie.suma.a.i.b.lambda;

import zajecia.drugie.suma.a.i.b.lambda.interfejs.SumaLambda;

public class WtrakcieLambda {

    private int suma = 0;
    private SumaLambda sumaLambda = (a,b) -> {
        int i = a;
        while (i <= b){
            suma += i;
            i++;
        }
        System.out.println(suma);
    return suma;};

    public SumaLambda getSumaLambda() {
        return sumaLambda;
    }
}
