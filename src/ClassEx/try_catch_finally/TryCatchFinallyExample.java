package ClassEx.try_catch_finally;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
            System.out.println("클래스를 찾았습니다.");
            // Class clazz2 = Class.forName("java.lang.String2");

        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } finally {
            System.out.println("무조건 실행됩니다.");
        }
    }
}
