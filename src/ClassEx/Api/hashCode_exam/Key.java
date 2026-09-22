package ClassEx.Api.hashCode_exam;

public class Key {
    public int number;

    public Key(int number) {    // 생성자 생성, 외부변수로 매개변수를 받음
        this.number = number;   // 필드 초기화
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        if (obj instanceof Key) {   // obj가 Key객체인지 확인(instanceof)
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number) { // 둘의 내부 데이터가 같으면
                return true;
            }
        }
        return false;
    }

    // hashCode를 동등하게 만들기
    @Override
    public int hashCode() {
      System.out.println("hashCode()");
      return number;
    }
}
