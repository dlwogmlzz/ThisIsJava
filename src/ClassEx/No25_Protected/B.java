package ClassEx.No25_Protected; // A와 동일한 패키지

// protected 접근 제한자 테스트
// default 접근 제한과 마찬가지로 B클래스의 생성자와 메서드에서는 A클래스의 protected 필드, 생성자, 메서드에 얼마든지 접근이 가능하다.
public class B {
    public void method() {
        A a = new A();      // (〇)
        a.field = "Value";  // (〇)
        a.method();         // (〇)
    }
}
