package ch06.sec08.exam03;

import java.sql.SQLOutput;

public class Car {
    // 필드 선언
    int gas;

    // 리턴값이 없는 메서드로 매개값을 받아서 gas필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴값이 boolean인 메서드로 gas 필드값이 0이면 false, 0이 아니면 true를 리턴
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;       // false를 리턴하고 메서드 종료.
        }

        System.out.println("gas가 있습니다.");
        return true;            // true를 리턴하고 메서드 종료.
    }

    // 리턴값이 없는 메서드로 gas필드값이 0이면 return 문으로 메서드를 종료.
    void run() {
        while(true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량: " + gas + ")");
                return;     // 메서드 종료.
//                break;
            }
        }
        // 위의 return으로 인해서 밑의 코드는 실행 안됨!!
        // 만약에 return자리에 break가 있었으면 밑의 코드가 실행됨.
        // System.out.println(11);
    }
}
