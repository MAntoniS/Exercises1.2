package zajecia.drugie.potęgi.klasycznie;

public class Potęgi {

    public void potęgiDwójki(int a){
        int i = 0;
        while (Math.pow(2,i)<a){
            System.out.println(Math.pow(2,i));
            i++;
        }

    }
}
