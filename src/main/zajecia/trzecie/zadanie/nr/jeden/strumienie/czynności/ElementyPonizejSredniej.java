package zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności;

import zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności.nad.klasa.Wykonaj;

public class ElementyPonizejSredniej extends Wykonaj {

    private WyznaczŚrednią wyznaczŚrednią = new WyznaczŚrednią();

    public void ilePoniżej(){
        int counter = 0;
        for (int i = 0; i< getTablicaStrumien().getTablicaS().length; i++){
            if (getTablicaStrumien().getTablicaS()[i]< wyznaczŚrednią.getŚrednia()){
                counter++;
            }

        }
    }

}
