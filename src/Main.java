import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Play Yahtzee");
        frame.setSize(500,500);
        JFrame applyNames = new JFrame("Enter Names");
        applyNames.setSize(500,500);
      JFrame game = new JFrame("Play Yahtzee");
      game.setSize(750,1000);
        
      
        JPanel panel = new JPanel(new GridLayout(3,1));
        JPanel getNames = new JPanel(new GridLayout(6,1));
        JPanel playGame = new JPanel(new GridLayout(12,17));

        JLabel askPlayerCount = new JLabel("How many computers do you want to play against? 1-3");
        JTextField getPlayerCount = new JTextField();
        JButton submit = new JButton("Submit");

      JLabel text = new JLabel("Enter names");
      
      JTextField player1Name = new JTextField("Your Name");
      JTextField player2Name = new JTextField("Computer 1");
      JTextField player3Name = new JTextField("Computer 2");
      JTextField player4Name = new JTextField("Computer 3");
      JTextField[] nameFields = {player1Name, player2Name, player3Name, player4Name};

      JLabel play1Name = new JLabel("");
      JLabel play1Bonus = new JLabel("Bonus: ");
      JLabel play1Ones = new JLabel("Ones: ");
      JLabel play1Twos = new JLabel("Twos: ");
      JLabel play1Threes = new JLabel("Threes: ");
      JLabel play1Fours = new JLabel("FOurs: ");
      JLabel play1Fives = new JLabel("Fives: ");
      JLabel play1Sixes = new JLabel("Sixes: ");
      JLabel play1SmallStraight = new JLabel("small Straight: ");
      JLabel play1LargeStraight = new JLabel("Large Straight: ");

      JButton submitNames = new JButton("Submit names");
      
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
                            getNames.add(text);
                          for(int i = 0; i <= playercount;i++){
                              getNames.add(nameFields[i]);
                              }
                            getNames.add(submitNames);
                            applyNames.add(getNames);
                            frame.setVisible(false);
                            applyNames.setVisible(true);
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