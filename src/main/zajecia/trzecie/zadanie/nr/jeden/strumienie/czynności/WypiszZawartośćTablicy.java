package zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności;

import zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności.nad.klasa.Wykonaj;

import java.util.Arrays;

public class WypiszZawartośćTablicy extends Wykonaj {


    @Override
    public void wykonajOperacje() {
        Arrays.stream(getTablicaStrumien().getTablicaS()).forEach(System.out::println);
    }
}
