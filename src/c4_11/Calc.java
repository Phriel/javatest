package c4_11;

class Calc {
    // a의 절댓값을 반환하는 static 메소드
    public static int abs(int a) { return a > 0 ? a : -a; }

    // a와 b 중 더 큰 값을 반환하는 static 메소드
    public static int max(int a, int b) { return (a > b) ? a : b; }

    // a와 b 중 더 작은 값을 반환하는 static 메소드
    public static int min(int a, int b) { return (a < b) ? a : b; }
}