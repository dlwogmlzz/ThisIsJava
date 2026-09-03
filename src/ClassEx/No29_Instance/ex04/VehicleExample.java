package ClassEx.No29_Instance.ex04;

// 강제 타입 변환
public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        // 오버라이딩된 메서드가 실행됨
        vehicle.run();

        // Vehicle 인터페이스에는 checkFace()가 없음.
        // vehicle.checkFace(); (X)

        Bus bus = (Bus) vehicle;    // 강제 타입 변환

        // Bus클래스에는 checkFace()가 있음
        bus.run();
        bus.checkFace();
    }
}
