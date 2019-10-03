package zajecia.drugie.suma.a.i.b.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RóbWtrakcieLambdaTest {

    RóbWtrakcieLambda r = new RóbWtrakcieLambda();

    @Test
    void róbWtrakcieLambdaTest(){
    r.getSumaLambda().obliczSume(4,11);
    }

}