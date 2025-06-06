package c4_11;

public class CalcEx {
    public static void main(String[] args) {
        // 객체 생성 없이 클래스 이름으로 static 메소드 호출
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}

// 5
// 10
// -8