package Example.No19_Final;

// final 필드 테스트
public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "키");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";            // final 필드는 값 수정 불가
        //p1.ssn = "654321-7?654321";   // final 필드는 값 수정 불가
        p1.name = "크크크";
    }
}
