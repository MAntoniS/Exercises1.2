package zajecia.trzecie.zadanie.nr.cztery;

public class DziesiętnyNaBinarny {

    private String wynik ="";
    private int p = 2;

    public  String konwersjaZM(int a){
        while (a>0){
            wynik =Integer.toString((a%p)) + wynik ;
            a = a/p;
        }
        return wynik;
    }
}
