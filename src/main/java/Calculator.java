import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    double number;
    double answer;
    int calculation;

    public Calculator() {
        prepareWindow();
        addComponents();
        frame.setVisible(true);
        addActionEvent();
    }

    JFrame frame = new JFrame();

    public void prepareWindow() {
        frame.setTitle("Calculator");
        frame.setSize(300, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("Clear");
    JButton buttonDelete = new JButton("Delete");
    JButton buttonEqual = new JButton("=");
    JButton buttonMultiply = new JButton("x");
    JButton buttonDivide = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    public void addComponents() {
        try { // без этих строчек некорректно отображаются компоненты на маке
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        label.setBounds(0, 0, 280, 50);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(label);

        textField.setBounds(10, 40, 280, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.white);
        textField.setOpaque(true);
        frame.add(textField);

        button7.setBounds(10, 160, 60, 40);
        button7.setFont(new Font("Arial", Font.BOLD, 20));
        button7.setBackground(Color.white);
        button7.setOpaque(true);
        frame.add(button7);

        button8.setBounds(80, 160, 60, 40);
        button8.setFont(new Font("Arial", Font.BOLD, 20));
        button8.setBackground(Color.white);
        button8.setOpaque(true);
        frame.add(button8);

        button9.setBounds(150, 160, 60, 40);
        button9.setFont(new Font("Arial", Font.BOLD, 20));
        button9.setBackground(Color.white);
        button9.setOpaque(true);
        frame.add(button9);

        button4.setBounds(10, 220, 60, 40);
        button4.setFont(new Font("Arial", Font.BOLD, 20));
        button4.setBackground(Color.white);
        button4.setOpaque(true);
        frame.add(button4);

        button5.setBounds(80, 220, 60, 40);
        button5.setFont(new Font("Arial", Font.BOLD, 20));
        button5.setBackground(Color.white);
        button5.setOpaque(true);
        frame.add(button5);

        button6.setBounds(150, 220, 60, 40);
        button6.setFont(new Font("Arial", Font.BOLD, 20));
        button6.setBackground(Color.white);
        button6.setOpaque(true);
        frame.add(button6);

        button1.setBounds(10, 280, 60, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        button1.setBackground(Color.white);
        button1.setOpaque(true);
        frame.add(button1);

        button2.setBounds(80, 280, 60, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 20));
        button2.setBackground(Color.white);
        button2.setOpaque(true);
        frame.add(button2);

        button3.setBounds(150, 280, 60, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 20));
        button3.setBackground(Color.white);
        button3.setOpaque(true);
        frame.add(button3);

        buttonDot.setBounds(80, 340, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(Color.white);
        buttonDot.setOpaque(true);
        frame.add(buttonDot);

        button0.setBounds(10, 340, 60, 40);
        button0.setFont(new Font("Arial", Font.BOLD, 20));
        button0.setBackground(Color.white);
        button0.setOpaque(true);
        frame.add(button0);

        buttonEqual.setBounds(150, 340, 60, 40);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.pink);
        buttonEqual.setOpaque(true);
        frame.add(buttonEqual);

        buttonDivide.setBounds(220, 160, 60, 40);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDivide.setBackground(Color.cyan);
        buttonDivide.setOpaque(true);
        frame.add(buttonDivide);

        buttonMultiply.setBounds(220, 280, 60, 40);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMultiply.setBackground(Color.cyan);
        buttonMultiply.setOpaque(true);
        frame.add(buttonMultiply);

        buttonMinus.setBounds(220, 220, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.cyan);
        buttonMinus.setOpaque(true);
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 340, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.cyan);
        buttonPlus.setOpaque(true);
        frame.add(buttonPlus);

        buttonDelete.setBounds(150, 100, 130, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonDelete);

        buttonClear.setBounds(10, 100, 130, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonClear);
    }

    public void addActionEvent() {
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEqual.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
        } else if (source == button0) {
            if (!textField.getText().equals("0")) {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == button1) {
            if (textField.getText().equals("0")) {
                textField.setText("1");
            } else {
                textField.setText(textField.getText() + "1");
            }
        } else if (source == button2) {
            if (textField.getText().equals("0")) {
                textField.setText("2");
            } else {
                textField.setText(textField.getText() + "2");
            }
        } else if (source == button3) {
            if (textField.getText().equals("0")) {
                textField.setText("3");
            } else {
                textField.setText(textField.getText() + "3");
            }
        } else if (source == button4) {
            if (textField.getText().equals("0")) {
                textField.setText("4");
            } else {
                textField.setText(textField.getText() + "4");
            }
        } else if (source == button5) {
            if (textField.getText().equals("0")) {
                textField.setText("5");
            } else {
                textField.setText(textField.getText() + "5");
            }
        } else if (source == button6) {
            if (textField.getText().equals("0")) {
                textField.setText("6");
            } else {
                textField.setText(textField.getText() + "6");
            }
        } else if (source == button7) {
            if (textField.getText().equals("0")) {
                textField.setText("7");
            } else {
                textField.setText(textField.getText() + "7");
            }
        } else if (source == button8) {
            if (textField.getText().equals("0")) {
                textField.setText("8");
            } else {
                textField.setText(textField.getText() + "8");
            }
        } else if (source == button9) {
            if (textField.getText().equals("0")) {
                textField.setText("9");
            } else {
                textField.setText(textField.getText() + "9");
            }
        } else if (source == buttonDot) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            if (str.endsWith(".")) {
                label.setText((str.replace(".", "") + "+"));
            } else {
                label.setText((str + "+"));
            }
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            if (str.endsWith(".")) {
                label.setText((str.replace(".", "") + "-"));
            } else {
                label.setText((str + "-"));
            }
            calculation = 2;
        } else if (source == buttonMultiply) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            if (str.endsWith(".")) {
                label.setText((str.replace(".", "") + "x"));
            } else {
                label.setText((str + "x"));
            }
            calculation = 3;
        } else if (source == buttonDivide) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            if (str.endsWith(".")) {
                label.setText((str.replace(".", "") + "/"));
            } else {
                label.setText((str + "/"));
            }
            calculation = 4;
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    String str = textField.getText();
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + str + "=");
                    calculation = 0;
                    break;
                case 2:
                    str = textField.getText();
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + str + "=");
                    calculation = 0;
                    break;
                case 3:
                    str = textField.getText();
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + str + "=");
                    calculation = 0;
                    break;
                case 4:
                    str = textField.getText();
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + str + "=");
                    calculation = 0;
                    break;
                case 0:
                    textField.setText(textField.getText());
                    break;
            }
        }
    }
}
