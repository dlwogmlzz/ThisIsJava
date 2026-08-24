package ch06.sec10.exam03;

public class Car {
    // 인스턴스 필드 선언
    int speed;

    // 인스턴스 메서드 선언
    void run() {
        System.out.println( speed + "km/h 로 달립니다.");
    }

    static void simulate() {
        // 객체 생성
        Car myCar = new Car();
        // 인스턴스 멤버 사용
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        // 정적 메서드 호출.
        simulate();

        // 객체 생성
        Car myCar = new Car();
        // 인스턴스 멤버 사용
        myCar.speed = 300;
        myCar.run();
    }
}
