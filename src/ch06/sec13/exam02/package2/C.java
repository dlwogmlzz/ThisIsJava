package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
    A a1 = new A(true);
    /*
    * a2는 default, a3은 private로 선언이 되어 있기 때문에,
    * 다른 클래스에서 사용하면 에러 발생..
    * */
    // A a2 = new A(1);
    // A a3 = new A("문자열");
}
