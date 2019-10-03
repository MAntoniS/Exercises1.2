package zajecia.jeden.dochodowy;

public class Podatek {

    public double obliczPodatek(double dochód){
        if (dochód >85.528){
            return ponizej(dochód);

        } else {
            return powyzej(dochód);
        }
    }

    private double ponizej(double dochód){
        double podatek =  dochód * 0.18- 556.02;
        System.out.println("Twój podatek wynosi " + podatek);
        return podatek;
    }

    private double powyzej(double dochód){
        double podatek = 14839.02 + (dochód - 85528) * 0.32;
        System.out.println("Twój podatek wynosi " + podatek);
        return podatek;
    }
}
