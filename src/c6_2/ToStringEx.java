package c6_2;

// ToStringEx.java
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString() 메소드를 오버라이딩
    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println(p.toString());
        System.out.println(p); // p.toString()으로 자동 변환되어 호출됨
        System.out.println(p + "입니다."); // p.toString() + "입니다."로 자동 변환됨
    }
}

// Point(2,3)
// Point(2,3)
// Point(2,3)입니다.