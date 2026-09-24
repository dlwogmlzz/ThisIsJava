package ClassEx.Api.stringclass;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                // 메서드 체이닝 패턴
                .append("ABC")
                .append("DEF")
                .insert(0, "GHI")
                .delete(3, 4)
                .toString();
        System.out.println(data);
    }
}
