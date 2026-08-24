package ch06.sec11.exam01;
/*
* final 필드에 초기값을 줄수 있는 방법..
* 1. 필드 선언 시에 초기값 대입
* 2. 생성자에서 초기값 대입
* */
public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
