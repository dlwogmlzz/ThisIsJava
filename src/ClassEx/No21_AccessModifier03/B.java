package ClassEx.No21_AccessModifier03;

// 필드와 메서드의 접근 제한
public class B {
    public B() {
        A a = new A();
        a.field1 = 1;   //(〇)
        a.field2 = 1;   //(〇)
        //a.field3 = 1;   //(X), private 필드 접근 불가(컴파일 에러)

        a.method1();    //(〇)
        a.method2();    //(〇)
        //a.method3();    //(x), private 메서드 접근 불가(컴파일 에러)
    }
}
