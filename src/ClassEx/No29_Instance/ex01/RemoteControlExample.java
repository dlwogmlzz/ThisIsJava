package ClassEx.No29_Instance.ex01;

// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc;
//        rc = new Television();
//        rc = new Audio();
        // 익명 구현 클래스
        RemoteControl rc = null;    // 인터페이스 변수 선언

        // 인터페이스 사용
        rc = new Television();      // Television 객체를 인터페이스 타입에 대입
        // 인터페이스의 turnOn(), turnOff() 호출
        rc.turnOn();
        // 디폴트 메서드 사용
        rc.setMute(true);
        // 정적 메서드 사용
        RemoteControl.ChangeBattery();
        rc.turnOff();


        rc = new Audio();           // Audio 객체를 인터페이스 타입에 대입
        // 인터페이스의 turnOn(), turnOff() 호출
        rc.turnOn();
        // 디폴트 메서드 사용
        rc.setMute(true);
        rc.turnOff();

    }
}
