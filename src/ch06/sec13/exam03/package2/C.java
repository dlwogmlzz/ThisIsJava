package ch06.sec13.exam03.package2; // A와 패키지가 다름..

import ch06.sec13.exam03.package1.A;

public class C {
    // 생성자 선언
    public C() {
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 3;
        // filed2가 default, field3이 private로 선언되어 있기 때문에 에러발생.
        // a.field2 = 3;
        // a.field3 = 3;

        // 메소드 호출
        a.method1();
        // method2가 default, method3이 private로 선언되어 있기 때문에 에러발생.
        // a.method2();
        // a.method3();
    }
}
