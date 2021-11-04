package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class opt2 {
    public static void main(String[] args) {
        new opt2.App("Task11_2");
    }

    public static class App extends JFrame{
        App(String s){
            super(s);

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);

            Container container = getContentPane();

            JLabel north = new JLabel("Север" );
            north.setHorizontalAlignment(JLabel.CENTER);
            north.setBorder(BorderFactory.createLineBorder(Color.black));
            north.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(north, "Сервер");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel east = new JLabel("Восток" );
            east.setHorizontalAlignment(JLabel.CENTER);
            east.setBorder(BorderFactory.createLineBorder(Color.black));
            east.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(east, "поток");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel south = new JLabel("Юг" );
            south.setHorizontalAlignment(JLabel.CENTER);
            south.setBorder(BorderFactory.createLineBorder(Color.black));
            south.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(south, "гю");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel west = new JLabel("Запад" );
            west.setHorizontalAlignment(JLabel.CENTER);
            west.setBorder(BorderFactory.createLineBorder(Color.black));
            west.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(west, "Отпад");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel center = new JLabel("Центр" );
            center.setHorizontalAlignment(JLabel.CENTER);
            center.setBorder(BorderFactory.createLineBorder(Color.black));
            center.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(center, "Мидл");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            container.add(north, BorderLayout.NORTH);
            container.add(east, BorderLayout.EAST);
            container.add(south, BorderLayout.SOUTH);
            container.add(west, BorderLayout.WEST);
            container.add(center);
            // Открываем окно
            pack();
            setSize(300,300);
        }
    }
}
