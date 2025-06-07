package c4_12;
import java.util.Scanner;



public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate); // 미국 달러 환율 설정

        // 100만원을 달러로 변환하여 출력
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        // 100달러를 원화로 변환하여 출력
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");

        scanner.close();
    }
}

// 환율(1달러)>> 1121
// 백만원은 $892.0606601248885입니다.
// $100는 112100.0원입니다.