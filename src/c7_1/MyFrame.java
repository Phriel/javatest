package c7_1;

import javax.swing.*;

// MyFrame.java
public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300, 300); // 프레임 크기를 300x300으로 설정
        setVisible(true); // 프레임을 화면에 표시
    }

    public static void main(String[] args) {
        // MyFrame 객체를 생성하여 프레임을 실행
        new MyFrame();
    }
}

// (300x300 크기의 "300x300 스윙 프레임 만들기"라는 제목을 가진 빈 창이 나타납니다.)