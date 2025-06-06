package c4_12;

class CurrencyConverter {
    // KWR/$1 환율을 저장하는 private static 변수
    private static double rate;

    // 한국 원화를 달러로 변환하는 static 메소드
    public static double toDollar(double won) {
        return won / rate;
    }

    // 달러를 한국 원화로 변환하는 static 메소드
    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    // 환율을 설정하는 static 메소드
    public static void setRate(double r) {
        rate = r;
    }
}