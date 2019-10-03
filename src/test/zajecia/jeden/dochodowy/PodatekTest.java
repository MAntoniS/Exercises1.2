package zajecia.jeden.dochodowy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PodatekTest {

    Podatek podatek = new Podatek();

    @Test
    void obliczPodatekPowyzej() {
        assertEquals(13843.98, podatek.obliczPodatek(80000));

    }
}