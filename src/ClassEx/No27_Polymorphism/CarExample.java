package ClassEx.No26_Promotion_3;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();    // Car 객체 생성

        for (int i = 1; i <= 5; i++) {  // Car 객체의 run() 메서드를 5번 반복 실행
            int problemLocation = car.run();

            switch(problemLocation) {
                // 앞 왼쪽 타이어가 펑크 났을 때, HankookTire로 교체
                case 1:
                    System.out.println();
            }
        }
    }
}
