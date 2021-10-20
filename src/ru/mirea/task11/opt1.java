package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opt1 {
    static class App extends JFrame {
        JTextField Text;
        JLabel l1;
        Listener listener = new Listener();
        int attempt = 0;
        int rand = 1 + (int) (Math.random() * 20);
        boolean win;

        private App(String name) {
            super(name);
            setLayout(new GridLayout(2, 1));
            setSize(400, 100);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);

            l1 = new JLabel(("Введите предполагаемое число:"));
            l1.setHorizontalAlignment(SwingConstants.CENTER);

            Text = new JTextField(10);
            Text.addActionListener(listener);

            add(l1);
            add(Text);
        }

        public class Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Дебаг " + rand);
                System.out.println("Попытка номер: " + attempt++);
                if (Integer.parseInt(Text.getText()) < rand) {
                    JOptionPane.showMessageDialog(App.this,
                            "Ваше число меньше заданного");
                }
                if (Integer.parseInt(Text.getText()) > rand) {
                    JOptionPane.showMessageDialog(App.this,
                            "Ваше число больше заданного");
                }
                if (Integer.parseInt(Text.getText()) == rand) {
                    win = true;
                    JOptionPane.showMessageDialog(App.this,
                            "УРА! ЭТО ОНО!");
                }
                if (win || (attempt == 3)) {
                    attempt = 0;
                    rand = 1 + (int) (Math.random() * 20);
                    if (win)
                        JOptionPane.showMessageDialog(App.this,
                                "Победа! Игра начинается заново");
                    else
                        JOptionPane.showMessageDialog(App.this,
                                "Потрачено три попытки! Игра начинается заново");
                    win = false;
                }
                Text.setText(null);
            }

        }

        public static void main(String[] args) {
            new App("G-gun");
        }
    }
}

