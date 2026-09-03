package ClassEx.No29_Instance.ex07;

// 자식 인터페이스
public interface ChildInterface3 extends ParentInterface {
    @Override
    public void method2();  // 추상 메서드로 재선언
    public void method3();
}
