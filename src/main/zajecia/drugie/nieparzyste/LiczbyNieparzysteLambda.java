package zajecia.drugie.nieparzyste;

import zajecia.drugie.nieparzyste.interfejsy.NieparzysteLambda;

public class LiczbyNieparzysteLambda {

    NieparzysteLambda nP = (a) -> {
        for (int i = 0; i < a; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

    } ;
    public void wypiszLiczby(int a){
        nP.wypiszLiczby(a);
    }
}
