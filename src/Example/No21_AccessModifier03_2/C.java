package Example.No21_AccessModifier03_2;    // 다른 패키지

import Example.No21_AccessModifier03.A;

// 필드와 메서드의 접근 제한
public class C {
    public C() {
        A a = new A();
        a.field1 = 1;    //(〇)
        //a.field2 = 1;    //(X), default 필드 접근 불가(컴파일 에러)
        //a.field3 = 1;    //(X), private 필드 접근 불가(컴파일 에러)

        a.method1();     //(〇)
        //a.method2();     //(X), default 메서드 접근 불가(컴파일 에러)
        //a.method3();     //(X), private 메서드 접근 불가(컴파일 에러)
    }
}
