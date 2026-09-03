package ClassEx.No29_Instance.ex04;

// 매개 변수의 인스턴스화
public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {   // vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
            Bus bus = (Bus) vehicle;    // Bus 객체일 경우 안전하게 강제 타입 변환 시킴.
            bus.checkFace();            // Bus 타입으로 강제 타입 변환을 하는 이유
        }
        vehicle.run();
    }
}
