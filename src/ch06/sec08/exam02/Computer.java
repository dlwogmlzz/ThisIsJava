package ch06.sec08.exam02;

// 클래스는 필드 선언(변수)과 생성자 선언도 있을수 있는데,
// 이 클래스는 메서드 선언만 있는 클래스..
public class Computer {
    // 가변길이 매개변수를 갖는 메소드 선언(...을 배열로 생각하면됨)
    int sum(int ... values) { // 매개값이 지정되지 않았고, 줄수 있는데 까지 줄수 있다. int값만..
    // int sum(int[] values) {
        // 전체합을 계산하기 위한 sum변수 선언, 0으로 초기화.
        int sum = 0;

        // values는 배열 타입의 변수처럼 사용.
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴..
        return sum;
    }
}
