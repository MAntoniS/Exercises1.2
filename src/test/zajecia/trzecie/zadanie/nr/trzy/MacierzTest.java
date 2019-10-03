package zajecia.trzecie.zadanie.nr.trzy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MacierzTest {

    Macierz m = new Macierz();
    @Test
    void wypełnijMacierz() {
        m.wypełnijMacierz();
        int[][] mTemp = m.wypełnijMacierz();
        System.out.print(Arrays.deepToString(mTemp));

    }


}