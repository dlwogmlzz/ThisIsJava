package ch06.sec13.exam03.package1; // A와 패키지가 같음..

public class B {
    public void method() {
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 2;
        a.field2 = 2;
        // a.field3 = 2;       // X private 필드 접근 불가(컴파일 에러)

        // 메소드 호출
        a.method1();
        a.method2();
        // a.method3();    // X private 메소드 접근 불가(컴파일 에러)
    }
}
