package zajecia.trzecie.zadanie.nr.dwa;

import java.util.Random;

public class TablicaDoDwudziestu {

    private int[] t = new int[20];
    private Random rand = new Random();
    private int [] porównawcza = {1,2,3,4,5,6,7,8,9,10};

    public TablicaDoDwudziestu() {
        wypełnijT();
    }

    private void  wypełnijT(){
        for (int i = 0; i<t.length; i++){
            t[i] = rand.nextInt(10) + 1;
        }
    }
    public void pTablice(){
        for(int i = 0; i<porównawcza.length;i++){
            porównaj(i);
        }
    }

    public void porównaj(int a){
        int counter = 0;
        for (int i = 0; i< t.length; i++) {
            //System.out.println(t[i]);
            if (porównawcza[a]==t[i]){counter ++;}
        }
        System.out.println(porównawcza[a] +" - "+ counter);

    }


}
