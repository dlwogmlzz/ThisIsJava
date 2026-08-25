package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        // 부모의 기본생성자() 호출, 생략 가능(컴파일 시 자동 추가됨), 부모생성자가 없다면 컴파일 에러 발생
        super();
        this.model = model; // 외부에서 받아서 다양한 값으로 저장하기 위함.
        this.color = color; // 외부에서 받아서 다양한 값으로 저장하기 위함.
        System.out.println("자식 SmartPhone(String model, String color) 생성자 실행됨");
    }
}
