package ClassEx.Api.thinclone_exam;

public class MemberExample {
    public static void main(String[] args) {
        // 멤버(원본) 객체 작성
        Member original = new Member("blue", "홍길동", "12345", 25, true);

        Member cloned = original.getMember();   // 위의 original과 똑같은 내부 객체 생성
        cloned.password = "67890";

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original.id);
        System.out.println("name: " + original.name);
        System.out.println("password: " + original.password);
        System.out.println("age: " + original.age);
        System.out.println("adult: " + original.adult);

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cloned.id);
        System.out.println("name: " + cloned.name);
        System.out.println("password: " + cloned.password);
        System.out.println("age: " + cloned.age);
        System.out.println("adult: " + cloned.adult);
    }
}
