# 오류의 종류

▶ 에러(Error)
    ● 하드웨어의 오동작 또는 고장으로 인한 오류
    ● 에러가 발생되면 프로그램 종료
    ● `정상 실행 상태를 돌아갈 수 없음`

▶ 예외(Exception)
    ● 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
    ● 예외가 발생되면 프로그램 종료
    ● `예외 처리를 추가하면` 정상 실행 상태로 돌아갈 수 있음
    ╰예외의 종류
    ▶ 일반(컴파일 체크) 예외(Exception)
        ● 예외 처리 코드가 없다면 컴파일이 되지 않는 예외
    ▶ 실행 예외(RuntimeException)
        ● 예외 처리 코드를 생략하더라도 컴파일이 되는 예외
        ● 경험에 따라 예외 처리 코드를 작성할 필요가 있다.
        ①NullPointerException
　　　　　👉객체 참조가 없는 상태, 즉 null값을 갖는 참조변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생 
            String data = null;                     // null이라서 객체가 없는 상태임.
            System.out.println(data.toString());    // NullPointerException

　　　　　②ArrayIndexOutOfBoundsException
        👉배열에서 인덱스 범위를 초과하여 사용할 경우 발생
            public static void main(String[] args) {
                String data1 = args[0];
                String data2 = args[1];
                System.out.println("args[0]:" + data1);
                System.out.println("args[1]:" + data2);
            }

        ③NumberFormatException
        👉문자열을 숫자로 변환하는 경우가 많다.
        👉숫자로 변환될 수 없는 문자가 포함되어 있을 경우 발생
            String data1 = "100";
            String data2 = "a100";

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

        ④ClassCastException
        👉타입 변환이 되지 않을 경우 발생


# 예외 처리 코드(try-catch-finally)

 ▶ 예외가 발생하면 프로그램 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드
   ● 일반 예외: 반드시 작성해야 컴파일이 된다.
   ● 실행 예외: 컴파일시 요구하지 않고 경험에 의해서 작성해야 한다.

 ▶ try-catch-finally 구문을 이용해서 예외 처리 코드를 작성한다.
 
try {
    // 예외 발생 가능 코드
} catch(예외클래스 e) {
    // 예외 처리
} finally {
    // 항상 실행
}