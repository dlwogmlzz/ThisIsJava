package ClassEx.No28_Abstract.Initialization;

// 실행 클래스
public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("--------");
        
        // 변수의 자동 타입 변환
        Animal animal = null;
        
        animal = new Dog(); // 자동 타입 변환
        animal.sound();     // 재정의된 메서드 호출
        
        animal = new Cat(); // 자동 타입 변환
        animal.sound();     // 재정의된 메서드 호출
        System.out.println("--------");
        
        // 메서드의 다형성(자동 타입 변환)
        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound(); // 재정의된 메서드 호출
    }
}
