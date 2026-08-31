package ClassEx.No24_Final_2;

// 재정의 할 수 없는 final 메서드
public class Car {
    // 필드
    public int speed;

    // 메서드
    public void speedUp() { speed += 1; }

    // final 메서드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
