package java_20241204;

import java.util.Scanner;

public class Method {
    static void scoreCalculator() {
        Scanner sc = new Scanner(System.in);


        int kor;
        int eng;
        int math;

        int total;
        int avg;
        String grade;

        System.out.print("당신의 국어 점수를 입력하세요");
        kor = sc.nextInt();
        System.out.print("당신의 영어 점수를 입력하세요");
        eng = sc.nextInt();
        System.out.print("당신의 수학 점수를 입력하세요");
        math = sc.nextInt();
        total = kor + eng + math;
        avg = total / 3;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 총점은 : " + total + "점이고,  평균은 : " + avg + "이며 등급은 :" + grade + "입니다");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//  총점과 등급 계산
        scoreCalculator();

// 구구단 출력
        gugudan();
        System.out.println("출력할 구구단의 단수를 입력해 주세요");

        int dan = sc.nextInt();

        System.out.println("\n-----" + dan + "단 출력");
        for (int i = 0; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);

        }

    }

    static void gugudan() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단수를 입력해 주세요");

        int dan = sc.nextInt();

        System.out.println("\n-----" + dan + "단 출력");
        for (int i = 0; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }


        }
    }

