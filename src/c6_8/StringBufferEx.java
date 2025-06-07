package c6_8;

// StringBufferEx.java
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil"); // " is pencil"을 덧붙임
        System.out.println(sb);

        sb.insert(7, " my"); // 인덱스 7에 " my" 삽입
        System.out.println(sb);

        sb.replace(8, 10, "your"); // 인덱스 8부터 10 전까지를 "your"로 변경
        System.out.println(sb);

        sb.delete(8, 13); // 인덱스 8부터 13 전까지("your ") 삭제
        System.out.println(sb);

        sb.setLength(4); // 문자열 길이를 4로 수정
        System.out.println(sb); // System.out.println은 sb.toString()을 호출
    }
}

// This is pencil
// This is my pencil
// This is your pencil
// This is pencil
// This