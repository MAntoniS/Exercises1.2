package zajecia.drugie.suma.a.i.b.kalsycznie;

public class Dla extends Suma{

    @Override
    public void suma(int a, int b) {
        if (a<b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);

        }
    }
}
