package c7_6;

import java.awt.*;
import javax.swing.*;

// NullContainerEx.java
public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null); // 배치관리자 제거

        // 레이블 생성 및 위치, 크기 설정
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        c.add(la);

        // 9개의 버튼을 반복문으로 생성하고 각기 다른 위치에 배치
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            c.add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}

//(버튼과 레이블이 코드에 지정된 절대 좌표에 배치된 창이 나타납니다.))