package ClassEx.No29_Instance.ex07;

// 자식 인터페이스
public interface ChildInterface2 extends ParentInterface {
    @Override
    public default void method2() {
        System.out.println("재정의");
    }

    public void method3();
}
