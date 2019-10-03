package zajecia.drugie.dzielniki.lambda;

public class DzielnikiLambda {

    private DzielnikiInterfejs dzielnikiInterfejs =
            (a) -> {
            for(int i = 1; i <= a; i++) {
                if (a % i == 0){
                    System.out.println(i);
                    }
                }
            };

    public DzielnikiInterfejs getDzielnikiInterfejs() {
        return dzielnikiInterfejs;
    }
}
