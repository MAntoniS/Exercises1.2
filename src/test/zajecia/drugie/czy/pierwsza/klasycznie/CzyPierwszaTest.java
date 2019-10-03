package zajecia.drugie.czy.pierwsza.klasycznie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CzyPierwszaTest {

    CzyPierwsza czyPierwsza = new CzyPierwsza();

    @Test
    void jestPierwsza() {

        czyPierwsza.czyPierwsza(19);

    }

    @Test
    void nieJestPierwsza(){
        czyPierwsza.czyPierwsza(20);

    }


}