package c6_9;

import java.util.StringTokenizer;

// StringTokenizerEx.java
public class StringTokenizerEx {
    public static void main(String[] args) {
        // "홍길동/장화/홍련/콩쥐/팥쥐" 문자열을 "/"를 기준으로 분리
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        
        // st에 다음 토큰이 있는 동안 반복
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // 다음 토큰을 가져와 출력
        }
    }
}

// 홍길동
// 장화
// 홍련
// 콩쥐
// 팥쥐