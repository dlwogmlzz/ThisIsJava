package ClassEx.No28_Abstract.Initialization;

// 추상 메서드 오버라이딩
public class Dog extends Animal { // 1. Animal 상속
    public Dog() {
        this.kind = "포유류";
    }

    // 2. 추상 메서드 재정의
    @Override
    public void sound() {
        System.out.println("뭉뭉");
    }
}
