package zajecia.jeden.agd;

import zajecia.jeden.agd.ilość.Dwa;
import zajecia.jeden.agd.ilość.Dziesięć;
import zajecia.jeden.agd.ilość.ObliczRate;
import zajecia.jeden.agd.ilość.Pięć;

public class AGDshop {
    ObliczRate obliczRate;

    public void sprzedażNaRaty(double cenaTowaru, int liczbaRat){
        switch(liczbaRat){
            case 6 - 12:
                obliczRate = new Dwa();
                obliczRate.rata(cenaTowaru, liczbaRat);
                break;
            case 13 - 24:
                obliczRate = new Pięć();
                obliczRate.rata(cenaTowaru,liczbaRat);
                break;
            case 25 - 48:
                obliczRate = new Dziesięć();
                obliczRate.rata(cenaTowaru,liczbaRat);
                break;
            default:
                System.out.println("Nie istnieje taka możliwość");
                break;
        }
    }
}
