import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Play Yahtzee");
frame.setSize(500,500);

        JPanel panel = new JPanel(new GridLayout(3,1));

        JLabel askPlayerCount = new JLabel("How many computers do you want to play against? 1-3");
        JTextField getPlayerCount = new JTextField();
        JButton submit = new JButton("Submit");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int playercount = 0;

                    try {
                        playercount = Integer.parseInt(getPlayerCount.getText());
                        if(playercount > 3 || playercount < 1){
                            askPlayerCount.setText("Invalid Number try again, pick 1-3");
                        }
                        else{
                            frame.setVisible(false);
                        }
                    }
                    catch(NumberFormatException numExcept){
                        askPlayerCount.setText("Invalid Number try again, pick 1-3");
                    }


            }
        });

        panel.add(askPlayerCount);
        panel.add(getPlayerCount);
        panel.add(submit);
        frame.add(panel);
        frame.setVisible(true);

    }
}