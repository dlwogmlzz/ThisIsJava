package ClassEx.No25_Protected_2;   // A와 다른 패키지

import ClassEx.No25_Protected.A;

// default 접근 제한과 마찬가지로 C클래스의 생성자와 메서드에서는 A클래스의 protected 필드, 생성자, 메서드에 접근할 수 없다.
public class C {
    //A a = new A();      // (X)
    //a.field = "Value";  // (X)
    //a.method();         // (X)
}
