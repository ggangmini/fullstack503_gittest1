package java_20241203;


public class carEx {
    public static void main(String[] args) {
// car 클래스 타입의 변수 mycar 선언
// new 키워드와 생성자를 사용하여 메모리에 인스턴스(객체) 생성
// 생성된 인스턴스(객체)의 주소를 car 클래스 타입의 변수 mycar에 저장
        car mycar=new car();
// mycar라는 변수명으로 누구의 데이터인지 확인
// 인스턴스 mycar의 필드(멤버 변수)를 호출하여 사용
        System.out.println("제작회사 : " + mycar.company);
        System.out.println("모델명 :" + mycar.model);
        System.out.println("색상 :" + mycar.color);
        System.out.println("최고속도 : "+ mycar.maxSpeed);
        System.out.println("현재속도 : " + mycar.speed);
// car에서 현재속도를 0으로 지정한 적이 없지만 기본값이 0이기때문에 현재속도가 0으로 출력됨



        mycar.speed = 60;
        System.out.println("수정된 속도 :" + mycar.speed);


        System.out.println("가격 : " + mycar.price);
        System.out.println("배기량 : " + mycar.displacement);
        System.out.println("전기차유무 : " + mycar.ev);

    }
}
