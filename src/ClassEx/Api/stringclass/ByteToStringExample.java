package ClassEx.Api.stringclass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        String data = "a자바";

        try {
            //인코딩(encoding): String -> byte[]
//            byte[] arr1 = data.getBytes("UTF-8"); // UTF-8은 글자가 안깨짐, 디코딩할때도 charsetName에 "UTF-8"을 안 넣어줘도 됨
            byte[] arr1 = data.getBytes("EUC-KR");

            System.out.println(arr1.length);
            System.out.println(Arrays.toString(arr1));

            //디코딩(decoding): byte[] -> String
            String data2 = new String(arr1, "EUC-KR");    // decoding할때도 인코딩 할때와 동일한 문자셋을 줘야 문자가 안깨지고 나옴.
            System.out.println(data2);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
