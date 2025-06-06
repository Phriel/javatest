package c7_5;

import java.awt.*;
import javax.swing.*;

// GridLayoutEx.java
public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4행 2열의 GridLayout 생성
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5); // 컴포넌트 간의 수직 간격을 5픽셀로 설정

        Container c = getContentPane();
        c.setLayout(grid);

        // 레이블과 텍스트 필드를 번갈아 추가
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}

//(이름, 학번, 학과, 과목을 입력할 수 있는 폼 형태의 창이 나타납니다.)