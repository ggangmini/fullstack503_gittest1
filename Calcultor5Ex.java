package java_20241204;

public class Calcultor5Ex {
    public static void main(String[] args) {

// 정적 멤버 : 클래스의 멤버 중에서 static 키워드를 사용한 멤버
// 정적 멤버는 객체 생성 없이 클래스명을 통해서 바로 사용 가능함
// 정적 필드는 객체를 생성했을 경우 데이터를 공유함
// 정적 멤버는 정적 멤버끼리만 사용이 가능함(중요)
//(정적 멤버가 인스턴스 멤버를 사용하면 오류 발생)


// Calcultor5의 정적 메소드를 호출하여 사용
// 정적 메소드는 객체 생성 없이 클래스명을 통해서 바로 사용 가능
        double result1 = Calcultor5.pi * 10 * 10;
        int result2 = Calcultor5.plus(10,20);
        int result3 = Calcultor5.minus(10,20);

        System.out.println("result1: "+result1);
        System.out.println("result2: " +result2);
        System.out.println("result3 : "+result3);
    }
}
