package ch06.sec08.exam04;

public class CalculatorExample {

    public static void main(String[] args) {
        // 객체 생성
        Calculator cal = new Calculator();  // Calculator의 위치정보를 생성한다고 생각하면됨.

        // 정사각형 넓이 구하기
        double result1 = cal.areaRectangle(10);     // 100

        // 직사각형 넓이 구하기
        double result2 = cal.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
