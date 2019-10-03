package zajecia.drugie.potęgi.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotęgiLambdaTest {
    PotęgiLambda potęgiLambda = new PotęgiLambda();

    @Test
    void potęgiLambdaTest(){
        potęgiLambda.getPotęgiInterfejs().oblicz(71);
    }

}