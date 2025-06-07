package c6_0.lib; // Calculator 클래스를 lib 패키지에 포함시킴

// 다른 패키지에서 접근 가능하도록 public으로 선언
public abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}