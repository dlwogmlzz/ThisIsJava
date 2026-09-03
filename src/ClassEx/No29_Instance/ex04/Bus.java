package ClassEx.No29_Instance.ex04;

// 구현 클래스
public class Bus implements Vehicle {

    // 구현한 메서드
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // 구현할 메서드?
    public void checkFace() {
        System.out.println("승차요금을 체크합니다.");
    }
}
