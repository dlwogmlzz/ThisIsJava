package ClassEx.Api.deepclone_exam;

import java.util.Arrays;

public class Member implements Cloneable {
    // 필드 선언
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    // 필드 초기화
    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    // 깊은 복제
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Object(super.)의 clone으로 얕은 복사
        Member cloned = (Member) super.clone();
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();  // 재정의한 clone이 온다.
        } catch (CloneNotSupportedException e) {

        }
        return cloned;
    }
}
