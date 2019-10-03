package zajecia.drugie.nieparzyste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiczbyNieparzysteLambdaTest {

    LiczbyNieparzysteLambda lNpLambda = new LiczbyNieparzysteLambda();
    @Test
    void wypiszLiczby() {

        lNpLambda.wypiszLiczby(15);

    }
}