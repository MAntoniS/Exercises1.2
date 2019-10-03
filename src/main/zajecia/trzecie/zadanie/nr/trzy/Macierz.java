package zajecia.trzecie.zadanie.nr.trzy;

import java.util.Random;

public class Macierz {

    private int[][] macierz = new int[5][5];
    private Random rand = new Random();
    private int[] najM = new int [5];
    private  int[] najW = new int [5];

    public int[][] wypełnijMacierz(){
        for (int i = 0; i < macierz.length; i++ ){
            for (int j = 0; j<macierz.length; j++){
                macierz[i][j] = rand.nextInt(11) - 5;
            }
        }
    return macierz;
    }

    public int wyznaczNajmniejszą(int a){
        int najmniejsza = macierz[a][0];
        for (int i = 0; i < macierz.length; i++){
            if (najmniejsza >macierz[a][i]){
                najmniejsza = macierz[a][i];
            }
        }
        return najmniejsza;
    }

    public int wyznaczNajwiekszą(int a){
        int największa = macierz[a][0];
        for (int i = 0; i < macierz.length; i++){
            if (największa < macierz[a][i]){
                największa = macierz[a][i];
            }
        }
        return największa;
    }

    public int[] wypełnijNajW(){
        for (int i = 0; i < najW.length; i++){
            najW[i] = wyznaczNajwiekszą(i);
        }
        return najW;
    }

    public int[] wypełnijNajM(){
        for (int i = 0; i< najM.length; i++){
            najM[i] = wyznaczNajmniejszą(i);
        }
        return najM;
    }
}
