package ClassEx.Api.equals_exam;

// 멤버(id)를 동등객체로 사용하려면 equals()와 hashCode()둘다 재정의가 되어야 한다.
public class Member {   // 기본적으로 모든 클래스는 Object를 상속(생략)하고 있다.
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();

    }
}
