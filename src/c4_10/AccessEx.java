package c4_10;

// AccessEx.java
public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;  // public 멤버이므로 접근 가능

        // aClass.b = 10; // 컴파일 오류! b는 private 멤버이므로 AccessEx 클래스에서 접근 불가
        // The field Sample.b is not visible

        aClass.c = 10;  // 동일 패키지이므로 default 멤버 접근 가능
    }
}