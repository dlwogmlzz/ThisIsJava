package ch06.sec13.exam02.package1;
/*
* 같은 클래스에서는 어떤 접근 제어자든 생성자를 만들어도 에러 안남..
* */
public class A {
    // 필드 선언(자신의 클래스 타입으로)
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // 생성자 선언
    public A(boolean b) {}
    A(int i) {

    }
    private A(String s) {

    }
}
