package zajecia.jeden.kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    Kalkulator kalkulator = new Kalkulator();

    @Test
    void kalkulatorMainDodawanie() {
        char dodawanie = '+';
        int a = 2;
        int b = 2;
        assertEquals(4,kalkulator.kalkulatorMain(a,b,dodawanie));
    }

    @Test
    void kalkulatorMainOdejmowanie() {
        char odejmownie = '-';
        int a = 2;
        int b = 2;
        assertEquals(0,kalkulator.kalkulatorMain(a,b,odejmownie));
    }

    @Test
    void kalkulatorMainMnożenie() {
        char mnożenie = '*';
        int a = 2;
        int b = 2;
        assertEquals(4,kalkulator.kalkulatorMain(a,b,mnożenie));
    }

    @Test
    void kalkulatorMainDzielenie() {
        char dzielenie = '/';
        int a = 2;
        int b = 2;
        assertEquals(1,kalkulator.kalkulatorMain(a,b,dzielenie));
    }

    @Test
    void kalkulatorMainDzieleniePrzezZero() {
        char dzielenie = '/';
        int a = 2;
        int b = 0;
        kalkulator.kalkulatorMain(a,b,dzielenie);
    }
}