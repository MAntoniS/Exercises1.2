package zajecia.drugie.suma.a.i.b.kalsycznie;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    Suma s;

    @Test
    void sumAWiekszeOdB() {
        s = new Wtrakcie();
        s.suma(1, 0);
    }

    @Test
    void sumaDla() {
        s = new Dla();
        s.suma(4,11);
    }
    @Test
    void sumaWtrakcie() {
        s = new Wtrakcie();
        s.suma(4,11);
    }

    @Test
    void sumaRóbWtrakcie() {
        s = new RóbWtrakcie();
        s.suma(4,11);
    }
}