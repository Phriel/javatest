package c6_3;

// EqualsEx.java
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 equals() 메소드를 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 같은 객체를 참조하는 경우
        if (obj == null || getClass() != obj.getClass()) return false; // 타입이 다른 경우

        Point p = (Point) obj; // obj를 Point 타입으로 다운캐스팅
        return x == p.x && y == p.y; // x, y 좌표가 모두 같으면 true 리턴
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);

        if (a == b) // false: a와 b는 서로 다른 객체
            System.out.println("a==b");
        if (a.equals(b)) // true: a와 b의 내용(좌표)이 같음
            System.out.println("a is equal to b");
        if (a.equals(c)) // false: a와 c의 내용이 다름
            System.out.println("a is equal to c");
    }
}

//a is equal to b