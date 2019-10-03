package zajecia.jeden.dochodowy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PodatekLambdaTest {

    PodatekLambda podatek = new PodatekLambda();

    @Test
    void obliczPodatekLamda() {
    assertEquals(13843.98,podatek.ObliczPodatekLamda(80000));
    }

}