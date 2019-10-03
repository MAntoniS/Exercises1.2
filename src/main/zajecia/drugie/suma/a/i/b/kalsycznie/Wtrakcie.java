package zajecia.drugie.suma.a.i.b.kalsycznie;

public class Wtrakcie extends Suma {

    @Override
    public void suma(int a, int b) {
        if (a < b) {
            int i = a;
            int sum = 0;
            while (i <= b) {
                sum += i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
