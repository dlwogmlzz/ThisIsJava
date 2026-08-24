package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        // Car객체 생성.
      Car myCar = new Car();

        // 리턴값이 없는 setGas() 메서드 호출.
        myCar.setGas(5);

        // ------------------------------------------------------------------------------------
        // isLeftGas() 메서드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행.
        // isLeftGas() 메서드를 호출하면
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            // 리턴값이 없는 run() 메서드 호출.
            myCar.run();
        }
        // ------------------------------------------------------------------------------------

        // gas가 없으면 밑의 출력문을 끝으로 종료...
        System.out.println("gas를 주입하세요.");
    }
}
