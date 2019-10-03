package zajecia.jeden.agd.ilość;

public class Dziesięć extends ObliczRate {
    @Override
    public void rata(double cenaTowaru, int liczbaRat) {
        double jednaRata = (cenaTowaru + odsetki(cenaTowaru)) / liczbaRat;
        System.out.println("Jedna rata wynosi " + jednaRata);
    }

    private double odsetki(double cenaTowaru){
        return cenaTowaru * 0.10;
    }
}
