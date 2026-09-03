package ClassEx.No29_Instance.ex02;

// 필드 다형성 테스트
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        // 타이어 교체
//        myCar.frontLeftTire = new KumhoTire();
//        myCar.frontRightTire = new KumhoTire();
//        myCar.backLeftTire = new KumhoTire();
//        myCar.backRightTire = new KumhoTire();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();

    }
}
