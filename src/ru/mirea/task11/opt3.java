package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opt3 {
    public static void main(String[] args) {
        new opt3.Application("Task11_3");
    }

    static class Application extends JFrame {

        Application(String s) {
            super(s);

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);

            setSize(300,150);
            setLayout(new FlowLayout());
            JRadioButton cianButton = new JRadioButton("Циан");
            cianButton.setForeground(Color.cyan);
            add(cianButton);

            JRadioButton magentaButton = new JRadioButton("Маджента");
            magentaButton.setForeground(Color.magenta);
            add(magentaButton);

            JRadioButton greenButton = new JRadioButton("Зеленый");
            greenButton.setForeground(Color.green);
            add(greenButton);

            ButtonGroup g1 = new ButtonGroup();
            g1.add(cianButton);
            g1.add(magentaButton);
            g1.add(greenButton);

            JRadioButton font1 = new JRadioButton("Dialog input");
            font1.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 12));
            add(font1);

            JRadioButton font2 = new JRadioButton("Monospaced");
            font2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
            add(font2);

            JRadioButton font3 = new JRadioButton("Sans serif");
            font3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
            add(font3);

            ButtonGroup g2 = new ButtonGroup();
            g2.add(font1);
            g2.add(font2);
            g2.add(font3);

            TextField text = new TextField(20);
            text.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
            add(text);

            cianButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.cyan);
                }
            });

            magentaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.magenta);
                }
            });

            greenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.green);
                }
            });

            font1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font1.getFont());
                }
            });

            font2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font2.getFont());
                }
            });

            font3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font3.getFont());
                }
            });
        }
    }
}
