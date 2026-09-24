package ClassEx.Api.wrapper_compareclass;

// Boxing과 Unboxing
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing: 기본 타입의 값을 넣어서 포장 객체로 만드는 과정.
        Integer obj = 100;
        System.out.println("value: " + obj.intValue()); // intValue() 메서드는 Integer 객체 내부의 int값을 리턴한다.

        // Unboxigng: 포장 객체에서 기본 타입의 값을 얻어내는 과정.
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
