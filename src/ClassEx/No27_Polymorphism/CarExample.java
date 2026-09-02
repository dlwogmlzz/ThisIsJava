package ClassEx.No27_Polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();    // Car 객체 생성

        for (int i = 1; i <= 5; i++) {  // Car 객체의 run() 메서드를 5번 반복 실행
            int problemLocation = car.run();

            switch(problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 타이어 HankookTire로 교체");
                    // 앞 왼쪽 타이어가 펑크 났을 때, HankookTire로 교체
                    car.frontLeftTire = new HankookTire("앞 왼쪽 타이어", 15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 타이어 KumhoTire로 교체");
                    // 앞 오른쪽 타이어가 펑크 났을 때, KumhoTire로 교체
                    car.frontRightTire = new KumhoTire("앞 오른쪽 타이어", 13);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 타이어 HankookTire로 교체");
                    // 뒤 왼쪽 타이어가 펑크 났을 때, HankookTire로 교체
                    car.backLeftTire = new HankookTire("뒤 왼쪽 타이어", 14);
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 타이어 KumhoTire로 교체");
                    // 뒤 오른쪽 타이어가 펑크 났을 때, KumhoTire로 교체
                    car.backRightTire = new KumhoTire("뒤 오른쪽 타이어", 17);
                    break;
            }
            System.out.println("----------------------------------------------------------"); // 1회전 시 출력되는 내용을 구분
        }
    }
}
