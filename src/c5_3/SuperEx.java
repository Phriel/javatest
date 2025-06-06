package c5_3;

// Point 클래스
class Point {
    private int x, y; // 점의 x, y 좌표

    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

// ColorPoint 클래스 (Point 상속)
class ColorPoint extends Point {
    private String color; // 점의 색상

    public ColorPoint(int x, int y, String color) {
        super(x, y); // 부모 클래스(Point)의 생성자 Point(x, y) 호출
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표와 색상 출력
        System.out.print(color);
        showPoint(); // 부모 클래스의 showPoint() 호출
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }
}

//blue(5,6)