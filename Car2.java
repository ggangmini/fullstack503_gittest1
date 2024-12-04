package java_20241204;

public class Car2 {
    // 필드(멤버 변수 선언)
    String moedl;
    int speed;
// 생성자 선언
    Car2(String model){
// 매개변수로 받은 model 필드인 model에 저장
        this.moedl = model;
    }

    void setSpeed(int speed){
// 매개변수로 받은 speed를 필드인 speed 에 저장
        this.speed = speed;
    }

    void run() {
        for (int i = 10; i<=50; i+=10  ){
            this.setSpeed(i);
            System.out.println(this.moedl +"가 달립니다.(시속 : " +this.speed +"km/s");
        }
    }
}
