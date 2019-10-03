package zajecia.trzecie.zadanie.nr.dwa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TablicaDoDwudziestuTest {
    TablicaDoDwudziestu t = new TablicaDoDwudziestu();

    @Test
    void porównaj() {
        t.porównaj(0);
        t.porównaj(1);


    }


    @Test
    void pTablice() {
    t.pTablice();

    }
}