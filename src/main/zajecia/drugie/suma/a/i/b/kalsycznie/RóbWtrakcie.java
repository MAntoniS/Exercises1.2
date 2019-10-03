package zajecia.drugie.suma.a.i.b.kalsycznie;

public class RóbWtrakcie extends Suma{

    @Override
    public void suma(int a, int b) {
        if (a<b) {
            int i = a;
            int sum = 0;
            do {
                sum += i;
                i++;
            }
            while (i <= b);
            System.out.println(sum);
        }
        }
}
