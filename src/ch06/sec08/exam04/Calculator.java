package ch06.sec08.exam04;

// 메서드 오버로딩
/*
* 메서드 오버로딩의 목적은 다양한 매개값을 처리하기 위해서이다.
* 매개변수의 수와 타입이 달라야 한다!!!!
*
* */
public class Calculator {
    // 정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형 넓이(메서드 오버로딩..)
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
