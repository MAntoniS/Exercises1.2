package zajecia.drugie.potęgi.lambda;

public class PotęgiLambda {
    private PotęgiInterfejs potęgiInterfejs =
            (a) -> {
        for(int i = 0; Math.pow(2,i) < a; i++){
            System.out.println(Math.pow(2,i));

        }
            };

    public PotęgiInterfejs getPotęgiInterfejs() {
        return potęgiInterfejs;
    }
}
