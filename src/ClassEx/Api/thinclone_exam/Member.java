package ClassEx.Api.thinclone_exam;

public class Member implements Cloneable {
    // 필드 선언
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    // 필드 초기화
    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    // 객체 리턴(복제)
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {

        }
        return cloned;
    }
}
