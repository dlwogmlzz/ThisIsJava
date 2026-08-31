package ClassEx.No25_Protected_3; // A클래스와 다른 패키지
import ClassEx.No25_Protected.A;

// C클래스와는 달리 D는 A의 자식 클래스이다.
// 그래서 A클래스의 protected 필드, 생성자, 메서드에 접근이 가능하다.
// 단 new연산자를 사용해서 생성자를 직접 호출할 수는 없고,
// 자식 생성자에서 super()로 A생성자를 호출할 수 있다.
public class D extends A {
    public D() {
        super();                // (〇)
        this.field = "Value";   // (〇)
        this.method();          // (〇)
    }
}
