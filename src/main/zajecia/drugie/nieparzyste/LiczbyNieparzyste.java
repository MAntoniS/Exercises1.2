package zajecia.drugie.nieparzyste;

public class LiczbyNieparzyste {

    public void wyświetlNIeparzyste(int a){

        for (int i = 0; i < a; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }

}
