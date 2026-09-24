package ClassEx.Api.wrapper_compareclass;

public class ValueCompareExample {
    public static void main(String[] args) {
        // -128 ~ 127 초과값일 경우, 객체가 따로 따로 만들어진다.
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));
        System.out.println("equals(): " + obj1.equals(obj2));
        System.out.println();

        // -128 ~ 127 범위값일 경우, 같은 객체가 만들어진다.
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4));
        System.out.println("equals(): " + obj3.equals(obj4));
    }
}
