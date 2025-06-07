package c7_3;

import java.awt.*;
import javax.swing.*;

// FlowLayoutEx.java
public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        // 왼쪽 정렬, 수평 간격 30, 수직 간격 40으로 FlowLayout 설정
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}

//(컴포넌트들이 왼쪽으로 정렬되고 지정된 간격으로 배치된 창이 나타납니다.)

