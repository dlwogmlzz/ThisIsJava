package ClassEx.No29_Instance.ex06;

// 기존 인터페이스
public interface MyInterface {
    public void method1();

    // 디폴트 메서드 추가
    // 인터페이스를 수정하더라도 컴파일 에러가 발생하지 않음.
    public default void method2() {
        System.out.println("MyInterface-method2() 실행");
    }
}
