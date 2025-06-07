package c6_6;

// AutoBoxingUnBoxingEx.java
public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
        
        // n을 Integer 타입의 객체로 자동 박싱
        Integer intObject = n; 
        System.out.println("intObject = " + intObject);

        // intObject를 int 값으로 자동 언박싱하여 10을 더함
        int m = intObject + 10; 
        System.out.println("m = " + m);
    }
}

// intObject = 10
// m = 20