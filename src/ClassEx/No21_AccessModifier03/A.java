package ClassEx.No21_AccessModifier03;

// 필드와 메서드의 접근 제한, 클래스 내부에서는 접근 제한과는 상관없이 필드와 메서드를 모두 사용할 수 있다.
public class A {
    // 필드
    public int field1;      // public 접근제한
    int field2;             // default 접근제한
    private int field3;     // private 접근제한

    // 생성자
    public A() {
        // 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
        field1 = 1;     // (〇)
        field2 = 1;     // (〇)
        field3 = 1;     // (〇)

        method1();
        method2();
        method3();
    }

    // 메서드
    public void method1() {}        // public 접근 제한
    void method2() {}               // default 접근 제한
    private void method3() {}       // private 접근 제한
}
