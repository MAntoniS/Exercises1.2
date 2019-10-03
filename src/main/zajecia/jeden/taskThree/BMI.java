package zajecia.jeden.taskThree;

public class BMI {

private double bmiCounter(double weight, double heigth){
    double bmi = weight/Math.pow(heigth, 2);
    return bmi;
}

public void bmiCheck(double a, double b){
    double bmi = bmiCounter(a,b);
    if (bmi>18.5 && bmi < 24.9 ) System.out.println("Waga w normie");
    if (bmi<18.5) System.out.println("Niedowaga");
    if (bmi>24.9) System.out.println("Nadwaga");
}

}
