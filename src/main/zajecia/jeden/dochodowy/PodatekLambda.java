package zajecia.jeden.dochodowy;

import zajecia.jeden.dochodowy.interfejsy.Oblicz;

public class PodatekLambda {

    public double ObliczPodatekLamda(double dochód) {
        if (dochód > 85.528) {
            Oblicz poniżej = () -> dochód * 0.18 - 556.02;
           return poniżej.oblicz();
        } else {
            Oblicz powyżej = () -> 14839.02 + (dochód - 85528) * 0.32;
            System.out.println(powyżej);
            return powyżej.oblicz();
        }


    }
}


