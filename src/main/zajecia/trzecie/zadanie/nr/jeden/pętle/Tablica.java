package zajecia.trzecie.zadanie.nr.jeden.pętle;

import javax.swing.text.StyledEditorKit;
import java.util.Random;

public class Tablica {

    private int[] tablicaIntów = new int[10];
    private Random rand = new Random();

    public Tablica() {
        wypełnijTablice();
    }

    public void wypełnijTablice(){
        int i = 0;
        for (int a:tablicaIntów) {
            tablicaIntów[i] = rand.nextInt(21) - 10 ;
            i++;
        }
    }

    public void wypiszTablice(){
        for (int a: tablicaIntów) {
            System.out.println(a);
        }
    }

    public void najmniejszy(){
        int najmniejszy = tablicaIntów[0];
        for (int i = 0; i < tablicaIntów.length ; i++){
            if (najmniejszy > tablicaIntów[i]){
                najmniejszy = tablicaIntów[i];
            }
        }
        System.out.println("Najmniejszy wpis tablicy to: " + najmniejszy);
    }

    public void największy(){
        int największy = tablicaIntów[0];
        for (int i = 0; i < tablicaIntów.length; i++){
            if (największy < tablicaIntów[i]){
                największy = tablicaIntów[i];
            }
        }
    }

    public double średniaA(){

        double średnia = 0;
        for (int a:tablicaIntów) {
            średnia += a;
        }
        return średnia/tablicaIntów.length;
    }



    public void ileMniejszych(){
        int counter = 0;
       for (int i = 0; i < tablicaIntów.length; i++){
           if (tablicaIntów[i]< średniaA()){
               counter ++;
           }
    }
        System.out.println("Poniżej średniej: " + counter);

    }

    public void ileWiększych(){
        int counter = 0;
        for (int i = 0; i < tablicaIntów.length; i++){
            if (tablicaIntów[i]> średniaA()){
                counter ++;
            }
        }
      System.out.println("Powyżej średniej " + counter);
    }

    public void odwrotnaKolejność(){
        for (int i = tablicaIntów.length - 1; i > 0; i--){
            System.out.println(tablicaIntów[i]);
        }
    }

}
