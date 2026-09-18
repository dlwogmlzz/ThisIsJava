package ClassEx.Error_Exception.runtime_exception;

public class NumberFormatException {

    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
    }
}
