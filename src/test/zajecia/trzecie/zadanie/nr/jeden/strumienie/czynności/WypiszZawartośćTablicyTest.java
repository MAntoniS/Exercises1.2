package zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności;

import org.junit.jupiter.api.Test;
import zajecia.trzecie.zadanie.nr.jeden.strumienie.czynności.nad.klasa.Wykonaj;

import static org.junit.jupiter.api.Assertions.*;

class WypiszZawartośćTablicyTest {

    Wykonaj wykonaj = new WypiszZawartośćTablicy();

    @Test
    void wykonajOperacje() {
        wykonaj.wykonajOperacje();
    }
}