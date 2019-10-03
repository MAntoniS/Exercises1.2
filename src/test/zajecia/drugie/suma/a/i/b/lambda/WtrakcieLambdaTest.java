package zajecia.drugie.suma.a.i.b.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WtrakcieLambdaTest {

    WtrakcieLambda w = new WtrakcieLambda();

    @Test
    void wTrakcieLambda(){
    w.getSumaLambda().obliczSume(4, 11);
    }

}