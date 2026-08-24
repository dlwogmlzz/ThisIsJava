package ch06.sec10.exam02;

public class Television {
    // 정적 필드 선언. 정적 필드는 보통 선언과 초기화를 동시에
    static String company = "MyCompany";
    static String model = "LCD";
    // 복잡한 연산식의 경우에 따라서 선언만 하는 경우도 있다.
    static String info;

    // 복수개의 정적 블록 선언. 클래스가 메모리로 로딩될때.
    static {
        System.out.println("1");
        info = "정보 : " + company;
        info += "-" + model;
    }

    static {
        System.out.println("2");
    }
}
