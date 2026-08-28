package ClassEx.No23_Inheritance;

// 자식 클래스
public class DmbCellPhoneExample {
    public static void main(String[] args) {
        // DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "노랑", 11);

        // CellPhone으로부터 상속받은 필드
        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        // DmbCellPhone의 필드
        System.out.println("채널: " + dmbCellPhone.channel);

        // CellPhone으로부터 상속받은 메서드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요?");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 김아무개입니다.");
        dmbCellPhone.sendVoice("네 안녕하세요. 저는 이씨입니다.");
        dmbCellPhone.hangUp();

        // DmbCellPhone의 메서드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
