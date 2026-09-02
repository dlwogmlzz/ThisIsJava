package ClassEx.No28_Abstract.Initialization;

// 추상 메서드 선언
public abstract class Animal {  // 추상클래스
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();   // 추상 메서드
}
