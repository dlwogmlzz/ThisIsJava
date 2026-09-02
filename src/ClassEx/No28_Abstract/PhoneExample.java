package ClassEx.No28_Abstract;

public class PhoneExample {
    public static void main(String[] args) {
        /*
            Phone은 abstract기 때문에, 생성자를 호출해서 객체를 생성할 수 없음
            대신 자식 클래스인 SmartPhone으로 객체를 생성해서 Phone의 메서드를 사용할 수 있다.
         */
        // Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone("홍길동");

        // Phone의 메서드를 사용할 수 있음.
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
