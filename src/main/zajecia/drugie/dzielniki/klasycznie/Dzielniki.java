package zajecia.drugie.dzielniki.klasycznie;

public class Dzielniki {

    public void dzielnikiLiczby(int a){

        int i = 1;
        while (i<=a){
            if(a % i == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
