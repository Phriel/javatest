package c6_1;

// ObjectPropertyEx.java
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    // Object 타입의 매개변수를 받아 객체의 정보를 출력하는 메소드
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 클래스 이름
        System.out.println(obj.hashCode());          // 해시 코드 값
        System.out.println(obj.toString());          // 객체를 문자열로 만들어 출력
        System.out.println(obj);                     // 객체 출력 (obj.toString()과 동일한 결과)
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);
        print(p);
    }
}

// 해시코드 값은 실행시마다 달라질수 있음
// Point
// 366712642
// Point@15db9742
// Point@15db9742