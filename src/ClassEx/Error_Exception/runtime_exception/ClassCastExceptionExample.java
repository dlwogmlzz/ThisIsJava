package ClassEx.Error_Exception.runtime_exception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
//        Animal animal = new Dog();
        Dog dog = new Dog();
        changeDog(dog);
//        Dog dog = (Dog) animal;

//        Cat cat = (Cat) animal;
        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("Dog로 변환이 어렵습니다.");
        }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
