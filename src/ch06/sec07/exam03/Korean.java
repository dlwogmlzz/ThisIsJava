package ch06.sec07.exam03;

public class Korean {
    // 필드선언
    String nation = "대한민국";
    String name = "이재희";
    String ssn = "001...";

    // 생성자 선언
    public Korean(String name, String ssn) { // 매개변수 선언
        // 매개변수의 이름이 짧으면 코드 가독성이 좋지 않음..
        // 매개변수의 이름을 필드에 저장을한다!!
        // 필드명과 매개변수명이 같을 경우에 「this」를 붙여줘서 이것이 필드명이라는 것을 명시 해준다!!
        name = name;   // this - 내가 가지고있는 .name 이름
        this.ssn = ssn;   // this - 내가 가지고있는 .ssn 주민등록번호..
    }
}
