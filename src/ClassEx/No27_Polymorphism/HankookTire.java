package ClassEx.No26_Promotion_3;

// Tire의 자식 클래스
public class HankookTire extends Tire {
    // 필드
    // 생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    // 메서드
    // 출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll()메서드
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire 수명: " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " kumhoTire 펑크 ***");
            return false;
        }
    }
}
