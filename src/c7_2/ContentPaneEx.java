package c7_2;

import java.awt.*;
import javax.swing.*;

// ContentPaneEx.java
public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        // 프레임의 닫기 버튼을 눌렀을 때 프로그램이 종료되도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬을 알아냄
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE); // 배경색을 오렌지색으로 설정
        // FlowLayout 배치관리자 설정. 컴포넌트를 왼쪽에서 오른쪽으로, 위에서 아래로 배치
        contentPane.setLayout(new FlowLayout());

        // 컨텐트팬에 버튼 추가
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}

// (주황색 배경에 OK, Cancel, Ignore 버튼이 차례로 배치된 창이 나타납니다.)