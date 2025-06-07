package c6_0.app; // GoodCalc 클래스를 app 패키지에 포함시킴

import c6_0.lib.Calculator; // 정확한 전체 패키지 경로를 사용

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Calculator c = new GoodCalc(); // 업캐스팅
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] { 2, 3, 4 }));
    }
}

// 5
// -1
// 3.0