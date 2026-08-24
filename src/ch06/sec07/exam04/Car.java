package ch06.sec07.exam04;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model = "아반뗴";
    String color = "그린";
    int maxSpeed = 250;

    // 기본 생성자 선언
    Car() {}

    // 생성자 오버로딩1, 매개값으로 객체의 필드를 다양하게 초기화 하기위해.
    Car(String model) {
        this.model = model;
    }

    // 생성자 오버로딩2(매개 변수의 순서가 다르면, 오버로딩이 아니고 컴파일 에러 발생!)
    Car(String model, String color) {
        model = model;
        color = color;
    }

    // 생성자 오버로딩3
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
