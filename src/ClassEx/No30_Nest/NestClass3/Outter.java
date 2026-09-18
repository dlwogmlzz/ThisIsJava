package ClassEx.No30_Nest.NestClass3;

// 로컬 클래스에서 사용 제한
public class Outter {
    // 자바 7 이전
    public void method1(final int arg) {
        final int localVariable = 1;
        // arg = 100;            // (✖)
        // localVariable = 100;  // (✖)
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    // 자바 8 이후
    public void method2(int arg2) {
        int localVariable2 = 1;
        arg2 = 100;
        localVariable2 = 100;
        class Inner {
            public void method() {
//                int result = arg2 + localVariable2;
            }
        }
    }
}
