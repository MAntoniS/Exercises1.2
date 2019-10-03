package zajecia.trzecie.zadanie.nr.jeden.strumienie;

import java.util.Arrays;
import java.util.Random;

public class TablicaStrumien {

    private int[] tablicaS = new int [10];

    public TablicaStrumien() {
        wypełnijTablice();
    }

    public void wypełnijTablice(){
        Random random= new Random();
        for (int i = 0; i<tablicaS.length; i++){
            tablicaS[i] = random.nextInt(21) - 10;

        }

    }

    public int[] getTablicaS() {
        return tablicaS;
    }

}
