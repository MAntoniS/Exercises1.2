package zajecia.drugie.dzielniki.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DzielnikiLambdaTest {


    DzielnikiLambda dzielnikiLambda = new DzielnikiLambda();

    @Test
    void zielnikiLambdaTest(){
        dzielnikiLambda.getDzielnikiInterfejs().dzielniki(21);
    }
}