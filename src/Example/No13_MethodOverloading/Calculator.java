package Example.No13_MethodOverloading;

// 메서드 오버로딩
public class Calculator {
    // 매개값에 따라 다르게 결과가 출력되도록 함.

    // 정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    // 직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
