package zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności;

import zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności.nad.klasa.Wykonaj;

import java.util.Arrays;

public class WyznaczNajmniejszyElement extends Wykonaj {

    @Override
    public void wykonajOperacje() {
        System.out.println(Arrays.stream(getTablicaStrumien().getTablicaS()).min());
    }
}
