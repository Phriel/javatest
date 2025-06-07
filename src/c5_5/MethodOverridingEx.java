package c5_5;

// MethodOverridingEx.java
class Shape { // 슈퍼 클래스
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        // p가 가리키는 객체 내에 오버라이딩된 draw() 호출 (동적 바인딩)
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line); // Line의 draw() 실행. "Line" 출력
        paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력
        paint(new Line());  // Line의 draw() 실행. "Line" 출력
        paint(new Rect());  // Rect의 draw() 실행. "Rect" 출력
        paint(new Circle());// Circle의 draw() 실행. "Circle" 출력
    }
}