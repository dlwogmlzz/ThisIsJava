package Example.No21_AccessModifier02_2;        // 다른 패키지

import Example.No21_AccessModifier02.A;

public class C {
    // 필드
    A a1 = new A(true);       // (〇)
    //A a2 = new A(1);          // (X), default 생성자 접근 불가(컴파일 에러)
    //A a3 = new A("문자열");    // (X), private 생성자 접근 불가(컴파일 에러)

}
