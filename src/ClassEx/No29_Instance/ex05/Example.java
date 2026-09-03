package ClassEx.No29_Instance.ex05;

// 호출 가능 메서드
public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        System.out.println("======== A 인터페이스 ========");
        ia.methodA();
        System.out.println();   //InterfaceA 변수는 methodA()만 호출가능

        InterfaceB ib = impl;
        System.out.println("======== B 인터페이스 ========");
        ib.methodB();
        System.out.println();   //InterfaceB 변수는 methodB()만 호출가능

        InterfaceC ic = impl;
        System.out.println("======== C 인터페이스 ========");
        // 상속한 InterfaceC 변수는 모두 호출 가능!!
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
