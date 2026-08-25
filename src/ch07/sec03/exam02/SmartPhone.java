package ch07.sec03.exam02;

public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        // 부모의 기본생성자() 호출, 생략 가능(컴파일 시 자동 추가됨), 부모생성자가 없다면 컴파일 에러 발생
        // super(); // 부모인 Phone에는 기본생성자가 존재하지 않는다.
        super(model, color); // 부모의 매개변수를 선언해줘야함.
        // model, color 부모에서 기재했기때문에 생략가능
        // this.model = model; // 외부에서 받아서 다양한 값으로 저장하기 위함.
        // this.color = color; // 외부에서 받아서 다양한 값으로 저장하기 위함.
        System.out.println("자식 SmartPhone(String model, String color) 생성자 실행됨");
    }
}
