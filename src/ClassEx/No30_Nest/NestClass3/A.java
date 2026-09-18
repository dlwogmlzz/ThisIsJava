package ClassEx.No30_Nest.NestClass3;

// 멤버 클래스에서 사용 제한
public class A {
    int field1;

    void method1() { }

    static int field2;
    static void method2() { }

    class B {
        void method() {
            // 모든 필드와 메서드에 접근할 수 있다.
            field1 = 10;
            method1();

            field2 = 20;
            method2();
        }
    }

    // 정적 클래스 C
    static class C {
        void method() {
            // 인스턴스 필드와 메서드는 정적 멤버에 접근할 수 없다.
            // field1 = 10;
            // method1();

            field2 = 20;
            method2();
        }
    }

}
