package Example.No18_Singleton;

public class SingeltonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();   // 컴파일 에러
        Singleton obj2 = new Singleton();   // 컴파일 에러
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {  // 단 하나의 객체만 리턴하기 때문에 아래코드의 변수1과 변수2는 동일한 객체를 참조
            System.out.println("같은 Singleton 객체 입니다.");
        } else {
            System.out.println("다른 Singleton 객체 입니다.");
        }
    }
}
