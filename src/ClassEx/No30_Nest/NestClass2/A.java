package ClassEx.No30_Nest.NestClass2;

// 바깥 필드와 메서드에서 사용 제한
public class A {
    // 인스턴스 필드
    B field1 = new B();                           // (〇)
    C field2 = new C();                           // (〇)

    // 인스턴스 메서드
    void method1() {
        B var1 = new B();                         // (〇)
        C var2 = new C();                         // (〇)
    }

    // 정적 필드 초기화
    // static B field3 = new B();                    // (✘)
    static C field4 = new C();                    // (〇)

    // 정적 메서드
    static void method2() {
        // B var1 = new B();                         // (✘)
        C var2 = new C();                         // (〇)
    }

    // 인스턴스 멤버 클래스
    class B {}

    // 정적 멤버 클래스
    static class C {}
}
