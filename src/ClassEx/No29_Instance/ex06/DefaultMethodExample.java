package ClassEx.No29_Instance.ex06;

// 디폴트 메서드 사용
public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterface mi1 = new MyClassA();
        mi1.method1();
        // MyInterface에 정의된 디폴트 메서드 실행.
        mi1.method2();

        MyInterface mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
    }
}
