package ClassEx.No29_Instance.ex02;

// Tire 구현 클래스1
public class HankookTire implements Tire {
    @Override
    // Tire 인터페이스 구현
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
