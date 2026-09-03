package ClassEx.No28_Abstract;

// 실체 클래스
// Phone 추상 클래스를 상속해서 SmartPhone 자식 클래스를 정의
public class SmartPhone extends Phone {
    // 생성자
    public SmartPhone(String owner) {
        // super를 이용해서 부모인 Phone의 생성자, owner를 호출함.
        super(owner);
    }

    // 메서드
    public void internetSearch() {
        System.out.println("인터넷을 검색 합니다.");
    }
}
