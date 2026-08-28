package Example.No21_AccessModifier03;

// 생성자 접근 제한
public class A {
    // 필드
    // 클래스 내부에서 A의 모든 생성자를 호출할 수 있음
    A a1 = new A(true);       // (〇)
    A a2 = new A(1);          // (〇)
    A a3 = new A("문자열");    // (〇)

    // 생성자
    public A(boolean b) {}     // public 접근 제한
    A(int b) {}                // default 접근 제한
    private A(String s) {}     // private 접근 제한
}


