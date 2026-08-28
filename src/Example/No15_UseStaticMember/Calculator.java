package Example.No15_UseStaticMember;

// 정적 멤버 사용
public class Calculator {
    static double pi = 3.141592;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
