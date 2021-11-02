package ru.mirea.task8;

import javax.swing.*;                   //для графической составляющей кнопок(сами поля кнопок)
import java.awt.event.ActionListener;
import java.awt.event.*;                //отслеживание нажатий на кнопку и прочее
import java.awt.*;

class App extends JFrame implements ActionListener {
    Image icon = Toolkit.getDefaultToolkit().getImage("src/ru/mirea/task8/res/MrBebra.jpg");
    JButton button = new JButton("Запустить");
    Container cont = this.getContentPane();
    ButtonGroup group = new ButtonGroup();
    JRadioButton radio1 = new JRadioButton("Bebra");
    JRadioButton radio2 = new JRadioButton("Bebra Searching");

    public App(String s) {
        super(s);
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setIconImage(icon);

        cont.setLayout(new GridLayout(2, 2, 2, 2));

        group.add(radio1);
        radio1.setSelected(true);
        cont.add(radio1);

        group.add(radio2);
        cont.add(radio2);


        cont.add(button);
        button.setBounds(200,100,100,50);
        button.addActionListener(this);

    }

    public void Bebra(){
        JFrame frame = new JFrame("Bebra tileset");
        frame.setSize(600,600);
        JLabel jlabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/res/Who_Said_B-E-B-R-A.jpg");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }
    public void BebraAnim(){
        JFrame frame = new JFrame("Bebra Searcher");
        frame.setSize(250,180);
        JLabel jlabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/res/BebraSearching.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(radio1.isSelected()){
            Bebra();
        }
        if(radio2.isSelected()){
            BebraAnim();
        }
    }
    public static void main(String[] args) {
        String[] title = new String[]{"Я бебра", "Меня зовут бебра", "Любители бебры", "БублКвас", "Задание 8"};
        new App("Task8: " + title[(int) (Math.random() * title.length - 1)]);
    }
}
