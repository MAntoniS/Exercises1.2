package zajecia.jeden.agd;

import org.junit.jupiter.api.Test;
import zajecia.jeden.agd.ilość.Dwa;
import zajecia.jeden.agd.ilość.ObliczRate;

class AGDshopTest {

    AGDshop agDshop = new AGDshop();
    ObliczRate obliczRate;

    @Test
    void sprzedażNaRaty() {
        double cena = 1000;
        int liczba = 7;
        obliczRate = new Dwa();

    }
}