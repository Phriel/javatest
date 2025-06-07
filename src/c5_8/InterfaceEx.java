package c5_8;

// 인터페이스 선언
interface PhoneInterface {
    final int TIMEOUT = 10000; // 상수 필드 선언 (public static final 생략 가능)
    void sendCall();           // 추상 메소드 (public abstract 생략 가능)
    void receiveCall();        // 추상 메소드

    default void printLogo() { // default 메소드
        System.out.println("** Phone **");
    }
}

// SamsungPhone 클래스가 PhoneInterface를 구현
class SamsungPhone implements PhoneInterface {
    // PhoneInterface의 모든 추상 메소드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    // 추가로 작성한 메소드
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();      // 인터페이스의 default 메소드 호출
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}

// ** Phone **
// 띠리리리링
// 전화가 왔습니다.
// 전화기에 불이 켜졌습니다.