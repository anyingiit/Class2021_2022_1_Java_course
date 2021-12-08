package S3_6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalJFrame {
    private JTextField MytextFieldB;
    private JTextField MytextFieldA;
    private JComboBox MyComboBox;
    private JButton MyButton;
    private JPanel MyJPanel;
    private JLabel MyJLabel;
    private JTextField textField1;
    private JCheckBox checkBox1;

    private double num1;
    private double num2;
    private char single;
    private String result;

    public CalJFrame() {
        MyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(MytextFieldA.getText().trim());
                num2 = Double.parseDouble(MytextFieldB.getText().trim());
                single = MyComboBox.getSelectedItem().toString().charAt(0);
                switch (single){
                    case '+':
                        result = Double.toString(num1 + num2);
                        break;
                    case '-':
                        result = Double.toString(num1 - num2);
                        break;
                    case '*':
                        result = Double.toString(num1 * num2);
                        break;
                    case '/':
                        result = Double.toString(num1 / num2);
                        break;
                    default:
                        System.out.println("您输入的操作符号有误");
                        result = "错误";
                        break;
                }
                MyJLabel.setText(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalJFrame");
        frame.setContentPane(new CalJFrame().MyJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
