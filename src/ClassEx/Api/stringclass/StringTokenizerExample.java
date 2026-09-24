package ClassEx.Api.stringclass;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String data1 = "홍길동&장보고,임꺽정";   // &을 뺀 문자, token: 3(홍길동,장보고,임꺽정)
        String[] arr = data1.split("&|,"); // '&' 이나 ',' 문자가 있을 경우 자름

        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/장보고/임꺽정";
        StringTokenizer st = new StringTokenizer(data2, "/");

        while (st.hasMoreTokens()) { // st변수안에 hasMoreTokens, 아직 남아 있는 Token이 있느냐??
            String token = st.nextToken();  // nextToken, 있으면 다음거 가져와라.
            System.out.println(token);
        }
    }
}
