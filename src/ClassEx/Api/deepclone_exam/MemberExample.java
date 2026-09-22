package ClassEx.Api.deepclone_exam;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));

        Member cloned = original.getMember();   // 깊은 복제된 멤버 생성.
        cloned.scores[0] = 100;
        cloned.car.model = "BMW R8";

        System.out.println("[원본 객체의 필드값]");
        System.out.println("원본 이름: " + original.name);
        System.out.println("원본 나이: " + original.age);
        System.out.print("scores: {");
        for (int i = 0; i < original.scores.length; i++) {
            System.out.print(original.scores[i]);
            System.out.print(i == (original.scores.length-1) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : " + original.car.model);
        System.out.println();

        System.out.println("[복제 객체의 필드값]");
        System.out.println("복제된이름: " + cloned.name);
        System.out.println("복제된나이: " + cloned.age);
        System.out.print("scores: {");
        for (int i = 0; i < cloned.scores.length; i++) {
            System.out.print(cloned.scores[i]);
            System.out.print(i == (cloned.scores.length-1) ? "" : ",");
        }
        System.out.println("}");
        System.out.println("car : " + cloned.car.model);
    }
}
