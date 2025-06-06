package c7_4;

import java.awt.*;
import javax.swing.*;

// BorderLayoutEx.java
public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        // 수평 간격 30, 수직 간격 20으로 BorderLayout 설정
        c.setLayout(new BorderLayout(30, 20));

        // 각 구역에 버튼 추가
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}

//(5개의 버튼이 동, 서, 남, 북, 중앙에 각각 배치된 창이 나타납니다.)

