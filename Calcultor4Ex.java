package java_20241204;

public class Calcultor4Ex {
    public static void main(String[] args) {

        Calcultor4 cal = new Calcultor4();

        double result1 = cal.areaRectangle(10);
        double result2 = cal.areaRectangle(10,20.0);

        System.out.println("정사각형 넓이 :"+result1);
        System.out.println("직사각형 넓이 :"+result2);
    }
}
