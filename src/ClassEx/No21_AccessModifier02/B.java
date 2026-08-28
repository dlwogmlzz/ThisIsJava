package ClassEx.No21_AccessModifier02;  // 패키지가 동일

public class B {
    A a1 = new A(true);       // (〇)
    A a2 = new A(1);          // (〇)
    //A a3 = new A("문자열");        // (X), private 생성자 접근 불가(컴파일 에러)

}
