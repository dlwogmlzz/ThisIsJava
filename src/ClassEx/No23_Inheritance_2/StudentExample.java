package ClassEx.No23_Inheritance_2;

public class StudentExample {
    public static void main(String[] args) {
        // 매개변수가 있는 생성자 이기때문에, 객체 생성시에 값을 넣어줌.
        Student student = new Student("이성계", "123456-1234567", 1);
        // name, ssn 부모에게 물려받은 필드 출력
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
