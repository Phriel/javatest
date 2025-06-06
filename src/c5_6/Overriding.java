package c5_6;

class Weapon {
    protected int fire() {
        return 1; // 무기는 기본적으로 한 명만 살상
    }
}

// Weapon을 상속받는 Cannon 클래스
class Cannon extends Weapon {
    @Override
    protected int fire() { // 메소드 오버라이딩
        return 10; // 대포는 한 번에 10명을 살상
    }
}

public class Overriding {
    public static void main(String[] args) {
        Weapon weapon;

        // Weapon 객체 사용
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

        // Cannon 객체 사용 (업캐스팅)
        weapon = new Cannon();
        // weapon 참조 변수는 Cannon 객체를 가리키므로, 오버라이딩된 Cannon의 fire()가 호출됨
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}

// 기본 무기의 살상 능력은 1
// 대포의 살상 능력은 10