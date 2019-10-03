package zajecia.drugie.dzielniki.klasycznie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DzielnikiTest {

    Dzielniki dzielniki = new Dzielniki();

    @Test
    void dzielnikiLiczby() {

        dzielniki.dzielnikiLiczby(21);
    }
}