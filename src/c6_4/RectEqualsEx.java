package c6_4;

// RectEqualsEx.java (파일 이름은 자유롭게 지정 가능)
class Rect {
    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 면적이 같으면 true를 리턴하도록 equals() 오버라이딩
    @Override
    public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       
       Rect p = (Rect) obj; // obj를 Rect 타입으로 다운캐스팅
       return (width * height) == (p.width * p.height); // 면적 비교
    }
}

public class RectEqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3); // 면적 6
        Rect b = new Rect(3, 2); // 면적 6
        Rect c = new Rect(3, 4); // 면적 12

        if (a.equals(b)) // true
            System.out.println("a is equal to b");
        if (a.equals(c)) // false
            System.out.println("a is equal to c");
        if (b.equals(c)) // false
            System.out.println("b is equal to c");
    }
}

//a is equal to b