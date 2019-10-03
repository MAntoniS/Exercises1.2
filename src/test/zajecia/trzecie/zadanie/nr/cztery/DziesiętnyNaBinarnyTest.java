package zajecia.trzecie.zadanie.nr.cztery;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DziesiętnyNaBinarnyTest {

    DziesiętnyNaBinarny d = new DziesiętnyNaBinarny();

    @Test
    void konwersja() {

    assertEquals(Integer.toBinaryString(75), d.konwersja(75));
    }
}