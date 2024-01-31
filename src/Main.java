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
      JLabel play1Fours = new JLabel("Fours: ");
      JLabel play1Fives = new JLabel("Fives: ");
      JLabel play1Sixes = new JLabel("Sixes: ");
      JLabel play1SmallStraight = new JLabel("small Straight: ");
      JLabel play1LargeStraight = new JLabel("Large Straight: ");
      JLabel play1Chance = new JLabel("Chance: ");
      JLabel play1FourKind = new JLabel("Four of Kind: ");
      JLabel play1ThreeKind = new JLabel("Three of Kind: ");
      JLabel play1Yahtzee = new JLabel("Yahtzee: ");
      JLabel play1FullHouse = new JLabel("Full House: ");

      JLabel play2Name = new JLabel("");
      JLabel play2Bonus = new JLabel("Bonus: ");
      JLabel play2Ones = new JLabel("Ones: ");
      JLabel play2Twos = new JLabel("Twos: ");
      JLabel play2Threes = new JLabel("Threes: ");
      JLabel play2Fours = new JLabel("Fours: ");
      JLabel play2Fives = new JLabel("Fives: ");
      JLabel play2Sixes = new JLabel("Sixes: ");
      JLabel play2SmallStraight = new JLabel("small Straight: ");
      JLabel play2LargeStraight = new JLabel("Large Straight: ");
      JLabel play2Chance = new JLabel("Chance: ");
      JLabel play2FourKind = new JLabel("Four of Kind: ");
      JLabel play2ThreeKind = new JLabel("Three of Kind: ");
      JLabel play2Yahtzee = new JLabel("Yahtzee: ");
      JLabel play2FullHouse = new JLabel("Full House: ");

      JLabel play3Name = new JLabel("");
      JLabel play3Bonus = new JLabel("Bonus: ");
      JLabel play3Ones = new JLabel("Ones: ");
      JLabel play3Twos = new JLabel("Twos: ");
      JLabel play3Threes = new JLabel("Threes: ");
      JLabel play3Fours = new JLabel("Fours: ");
      JLabel play3Fives = new JLabel("Fives: ");
      JLabel play3Sixes = new JLabel("Sixes: ");
      JLabel play3SmallStraight = new JLabel("small Straight: ");
      JLabel play3LargeStraight = new JLabel("Large Straight: ");
      JLabel play3Chance = new JLabel("Chance: ");
      JLabel play3FourKind = new JLabel("Four of Kind: ");
      JLabel play3ThreeKind = new JLabel("Three of Kind: ");
      JLabel play3Yahtzee = new JLabel("Yahtzee: ");
      JLabel play3FullHouse = new JLabel("Full House: ");

      JLabel play4Name = new JLabel("");
      JLabel play4Bonus = new JLabel("Bonus: ");
      JLabel play4Ones = new JLabel("Ones: ");
      JLabel play4Twos = new JLabel("Twos: ");
      JLabel play4Threes = new JLabel("Threes: ");
      JLabel play4Fours = new JLabel("Fours: ");
      JLabel play4Fives = new JLabel("Fives: ");
      JLabel play4Sixes = new JLabel("Sixes: ");
      JLabel play4SmallStraight = new JLabel("small Straight: ");
      JLabel play4LargeStraight = new JLabel("Large Straight: ");
      JLabel play4Chance = new JLabel("Chance: ");
      JLabel play4FourKind = new JLabel("Four of Kind: ");
      JLabel play4ThreeKind = new JLabel("Three of Kind: ");
      JLabel play4Yahtzee = new JLabel("Yahtzee: ");
      JLabel play4FullHouse = new JLabel("Full House: ");
      
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

        //submitNames.addActionListener();
      
        panel.add(askPlayerCount);
        panel.add(getPlayerCount);
        panel.add(submit);
        frame.add(panel);
        frame.setVisible(true);

    }
}