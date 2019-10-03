package zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności;

import zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności.nad.klasa.Wykonaj;

public class WyznaczŚrednią extends Wykonaj {

    private double średnia;

    @Override
    public void wykonajOperacje() {

    }

    private double wyznaczŚrednią(){
        średnia = 0/getTablicaStrumien().getTablicaS().length;
        for (int i = 0; i<getTablicaStrumien().getTablicaS().length; i++){
            średnia += getTablicaStrumien().getTablicaS()[i];
        }
        return średnia;
    }

    public double getŚrednia() {
        return średnia;
    }
}
