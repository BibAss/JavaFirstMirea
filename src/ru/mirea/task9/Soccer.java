package ru.mirea.task9;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Soccer extends JFrame {
    public static class App extends JFrame {
        JButton b1, b2;
        JLabel l1, l2, l3;
        int team1,team2 = 0;
        String Team1, Team2;
        Listener listener = new Listener();

        private App(String name) {
            super(name);
            setLayout(new FlowLayout());
            setSize(300, 180);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            Team1 = "TeamSpirit";
            Team2 = "PSG";
            b1 = new JButton(Team1);
            b2 = new JButton(Team2);
            l1 = new JLabel("Result: 0X0");
            l2 = new JLabel("Last Scorer: N/A");
            l3 = new JLabel("Winner: Draw");

            add(b1);
            add(l1);
            add(b2);
            add(l2);
            add(l3);
            b1.addActionListener(listener);
            b2.addActionListener(listener);
        }
        public int checkResults()
        {
          if (team1 > team2)
          {
              return 1;
          }
          else if(team1 == team2)
          {
              return 10;
          }
          else
          {
              return 0;
          }
        }

            public class Listener implements ActionListener
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == b1)
                    {
                        team1 += 1;
                        l1.setText("Result: " + team1 + "X" + team2);
                        l2.setText("Last Scorer: " + Team1);
                        if(checkResults() == 1)
                        {
                            l3.setText("Winner: " + Team1);
                        }
                        else if(checkResults() == 0)
                        {
                            l3.setText("Winner: " + Team2);
                        }
                        else
                        {
                            l3.setText("Winner: Draw");
                        }
                    }
                    if(e.getSource() == b2)
                    {
                        team2 += 1;
                        int a = checkResults();
                        l1.setText("Result: " + team1 + "X" + team2);
                        l2.setText("Last Scorer: " + Team2);
                        if(checkResults() == 1)
                        {
                            l3.setText("Winner: " + Team1);
                        }
                        else if(checkResults() == 0)
                        {
                            l3.setText("Winner: " + Team2);
                        }
                        else
                        {
                            l3.setText("Winner: Draw");
                        }
                    }
            }

        }
    }

    public static void main(String[] args) {
        new App("Soccer");
    }
}
