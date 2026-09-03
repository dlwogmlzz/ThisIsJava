package ClassEx.No29_Instance;

/*
    만약 인터페이스에 선언된 추상 메서드에 대응하는 실체 메서드를 구현 클래스가 작성하지 않으면
    구현 클래스는 자동적으로 추상 클래스가 된다. 그렇기 때문에 클래스 선언부에 abstract키워드를 추가해야 한다.
 */
public class Television implements RemoteControl {
    // 필드
    private int volume;

    // turnOn() 추상 메서드의 실체 메서드
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메서드의 실체 메서드
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // setVolumn() 추상메서드의 실체 메서드
    // 인터페이스 상수를 이용해서 volumn 필드의 값을 제한.
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + volume);
    }
}
