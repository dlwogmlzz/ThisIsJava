package ClassEx.No14_InstanceMemberThis;

// 인스턴스 멤버와 this
public class Car {
    // 필드
    String model;
    int speed;

    // 생성자
    Car(String model) {
        // this는 주로 생성자와 메서드의 매개 변수 이름이 필드와 동일한 경우, 인스턴스 멤버인 필드임을 명시하고자 할 때 사용된다.
        this.model = model;
    }

    // 메서드
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for (int i = 10; i <= 50 ; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
        }
    }
}
