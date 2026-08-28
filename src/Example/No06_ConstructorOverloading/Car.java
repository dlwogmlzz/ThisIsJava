package Example.ex06;

// 생성자의 오버로딩
public class Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car() {} // 생성자①
    Car(String model) { // 생성자②
        this.model = model;
    }
    Car(String model, String color) { // 생성자③
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed) { // 생성자④
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
