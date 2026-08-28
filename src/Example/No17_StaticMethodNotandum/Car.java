package Example.ex17;

// 정적 메서드와 블록 선언 시 주의할 점
public class Car {
    int speed;

    void run() {
        System.out.println(speed + "km/h로 달립니다.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 100;
        myCar.run();
    }
}
