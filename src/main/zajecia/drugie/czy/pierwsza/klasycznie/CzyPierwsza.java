package zajecia.drugie.czy.pierwsza.klasycznie;

public class CzyPierwsza {

    public void czyPierwsza(int a){
        boolean isPrime = false;

        for (int i = 2; i < a; i++){
            if ( a % i == 0){
                isPrime = true;}
        }
        isTrue(isPrime);
        isFalse(isPrime);

    }

    private void isTrue(boolean a){
        if (a){
            System.out.println("To nie jest liczba pierwza");
        }
    }

    private void isFalse(boolean a){
        if (!a){
            System.out.println("To jest liczba pierwsza");
        }
    }


}
