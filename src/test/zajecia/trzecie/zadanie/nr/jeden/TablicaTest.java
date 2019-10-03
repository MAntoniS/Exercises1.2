package zajecia.trzecie.zadanie.nr.jeden;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import zajecia.trzecie.zadanie.nr.jeden.pętle.Tablica;

class TablicaTest {

    Tablica tablica = new Tablica();

    @Test
    void wypełnijTablice() {
        Assert.assertNotNull(tablica);
    }

    @Test
    void wypiszTablice() {
        tablica.wypiszTablice();
    }

    @Test
    void najmniejszy() {
        tablica.najmniejszy();
    }

    @Test
    void średniaA() {
       double średniaTest = tablica.średniaA();
        System.out.println(średniaTest);
    }

    @Test
    void ileMniejszych() {
        tablica.ileMniejszych();
    }

    @Test
    void odwrotnaKolejność() {
        tablica.odwrotnaKolejność();

    }

    @Test
    void ileWiększych() {
        tablica.ileWiększych();
    }
}