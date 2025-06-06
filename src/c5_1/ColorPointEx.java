package c5_1;

// Point 클래스: (x, y) 좌표를 나타냄
class Point {
    private int x, y; // 한 점을 구성하는 x, y 좌표

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

// ColorPoint 클래스: Point를 상속받아 색을 가진 점을 나타냄
class ColorPoint extends Point {
    private String color; // 점의 색상

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표와 색상 출력
        System.out.print(color);
        showPoint(); // 부모 클래스(Point)의 showPoint() 메소드 호출
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        // Point 객체 생성 및 활용
        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        // ColorPoint 객체 생성 및 활용
        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);          // 부모 클래스의 set() 호출
        cp.setColor("red");    // ColorPoint의 setColor() 호출
        cp.showColorPoint();
    }
}

// (1,2)
// red(3,4)