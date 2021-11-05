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

            JLabel north = new JLabel("North" );
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
                    JOptionPane.showMessageDialog(north, "Север!");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel east = new JLabel("East" );
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
                    JOptionPane.showMessageDialog(east, "Восток!");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel south = new JLabel("South" );
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
                    JOptionPane.showMessageDialog(south, "Юг!");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel west = new JLabel("West" );
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
                    JOptionPane.showMessageDialog(west, "Запад");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            JLabel center = new JLabel("Center" );
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
                    JOptionPane.showMessageDialog(center, "Центр");
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

            pack();
            setSize(300,300);
        }
    }
}
