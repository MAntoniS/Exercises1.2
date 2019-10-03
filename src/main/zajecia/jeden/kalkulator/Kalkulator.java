package zajecia.jeden.kalkulator;

public class Kalkulator {
    Operator operator;
    public int kalkulatorMain(int a, int b, char c){

        switch (c){
            case '+':
                operator = ()->a + b;
                System.out.println(operator.oblicz());
                break;
            case '-':
                operator = ()-> a - b;
                System.out.println(operator.oblicz());
                break;
            case '*':
                operator = ()-> a * b;
                System.out.println(operator.oblicz());
                break;
            case '/':
                operator = ()->{
                    if (b==0){
                        System.out.println("Pamiętaj cholero, nie dziel przez ...");
                        return 0;
                    }else { return    a / b; }
                };
                break;
            default:
                System.out.println("nie ma takiej możliwości");
                break;
        }

        return operator.oblicz();
    }
}
