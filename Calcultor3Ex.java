package java_20241204;

import java.util.Scanner;

public class Calcultor3Ex {
    public static void main(String[] args) {

        Calcultor3 cal = new Calcultor3();

        System.out.println("--------1번 형태 사용---------");
        cal.plus1();
        cal.plus1();
        cal.plus1();

        System.out.println("---------2번 형태 사용----------");
        cal.plus2(10,3);
        cal.plus2(10,20);

        System.out.println("----------3번 형태 사용-----------");
        int result3 = cal.plus3();
        System.out.println("두 수의 덧셈은 "+result3+"입니다.");
        result3 = result3+10;
        System.out.println("반환받은 데이터를ㅊ 추가 연산 후 결과 :" + result3);

        System.out.println("----------4번 형태 사용-----------");
        int result4 = cal.plus4(10,3);
        System.out.println("두 수의 덧셈은 " + result4 + "입니다.");
        result4 = cal.plus4(10,20);
        result4 = result4*2;
        System.out.println("반환받은 데이터를 추가 연산 후 결과 :" + result4);



    //문제1 ) Calcultor3 클래스에 사칙 연산을 위한 메소드를 선언하고
    // 그 메소드를 사용하여 결과를 사칙 연산의 결과를 출력하는 프로그램을 작성하세요.
// # 메소드명 : sum(덧셈), sub(뺄셈) ,multi(곱셈) , div(나눗셈)
// # sum - 2번형태 , multi - 4번 형태 , div - 1번 형태 , sub- 3번형태


        System.out.println("------sum방식 사용--------");
        cal.sum(20,5);

        System.out.println("------sub방식 사용--------");
        int result5 = cal.sub();
        System.out.println("두 수의 뺄셈은 "+result5+"입니다.");

        System.out.println("------div방식 사용--------");
        cal.div();

        System.out.println("------multi방식 사용--------");
        int result6 = cal.multi(20,5);
        System.out.println("두 수의 곱셈은 " + result6 + "입니다.");

        System.out.println("출력하고자 하는 구구단의 단을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int result7=cal.dan(4,3);
        int x = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(x+"단 :"+x+"*"+i+"="+(x*i));
        }



    }
}
