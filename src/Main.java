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
      game.setSize(1500,750);
        
      
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

        ImageIcon die1icon = new ImageIcon("Images/1die.png");
        die1icon.setImage(die1icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        ImageIcon die2icon = new ImageIcon("Images/2die.png");
        die2icon.setImage(die2icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        ImageIcon die3icon = new ImageIcon("Images/3die.png");
        die3icon.setImage(die3icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        ImageIcon die4icon = new ImageIcon("Images/4die.png");
        die4icon.setImage(die4icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        ImageIcon die5icon = new ImageIcon("Images/5die.png");
        die5icon.setImage(die5icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        ImageIcon die6icon = new ImageIcon("Images/6die.png");
        die6icon.setImage(die6icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));

        ImageIcon blankicon = new ImageIcon("Images/blank.png");
        blankicon.setImage(blankicon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        JLabel firstDie = new JLabel(blankicon);
        JLabel secondDie = new JLabel(blankicon);
        JLabel thirdDie = new JLabel(blankicon);
        JLabel fourthDie = new JLabel(blankicon);
        JLabel fifthDie = new JLabel(blankicon);

        JButton rollButton = new JButton("Roll");
        JButton onesButton = new JButton("ones");
      JButton twosButton = new JButton("twos");
      JButton threesButton = new JButton("threes");
      JButton foursButton = new JButton("fours");
      JButton fivesButton = new JButton("fives");
      JButton sixesButton = new JButton("sixes");

      JButton threeKindButton = new JButton("Three Kind");
      JButton fourKindButton = new JButton("Four Kind");
      JButton smallStraightButton = new JButton("Small Straight");
      JButton largeStraightButton = new JButton("Large Straight");
      JButton fullHouseButton = new JButton("Full House");
      JButton yahtzeeButton = new JButton("Yahtzee");
      JButton chanceButton = new JButton("Chance");

      JButton resetSaved = new JButton("reset saved");
      JButton saveOne = new JButton("save die one");
      JButton saveTwo = new JButton("save die two");
      JButton saveThree = new JButton("save die three");
      JButton saveFour = new JButton("save die four");
      JButton saveFive = new JButton("save die five");

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
        JLabel play1Score = new JLabel("Score: 0");

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
        JLabel play2Score = new JLabel("Score: 0");

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
        JLabel play3Score = new JLabel("Score: 0");

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
      JLabel play4Score = new JLabel("Score: 0");

      JLabel[] player1UpperLabels = {play1Name,play1Ones,play1Twos, play1Threes, play1Fours, play1Fives, play1Sixes,play1Bonus};
      JLabel[] player1LowerLabels = {play1Score,play1ThreeKind,play1FourKind, play1FullHouse, play1SmallStraight, play1LargeStraight, play1Chance,play1Yahtzee};

        JLabel[] player2UpperLabels = {play2Name,play2Ones,play2Twos, play2Threes, play2Fours, play2Fives, play2Sixes,play2Bonus};
        JLabel[] player2LowerLabels = {play2Score,play2ThreeKind,play2FourKind, play2FullHouse, play2SmallStraight, play2LargeStraight, play2Chance,play2Yahtzee};

        JLabel[] player3UpperLabels = {play3Name,play3Ones,play3Twos, play3Threes, play3Fours, play3Fives, play3Sixes,play3Bonus};
        JLabel[] player3LowerLabels = {play3Score,play3ThreeKind,play3FourKind, play3FullHouse, play3SmallStraight, play3LargeStraight, play3Chance,play3Yahtzee};

        JLabel[] player4UpperLabels = {play4Name,play4Ones,play4Twos, play4Threes, play4Fours, play4Fives, play4Sixes,play4Bonus};
        JLabel[] player4LowerLabels = {play4Score,play4ThreeKind,play4FourKind, play4FullHouse, play4SmallStraight, play4LargeStraight, play4Chance,play4Yahtzee};

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

        submitNames.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int playerCount = Integer.parseInt(getPlayerCount.getText()) + 1;
                play1Name.setText(player1Name.getText());
                Computer comp1 = new Computer("Seaver");
                Computer comp2 = new Computer("Alex");
                Computer comp3 = new Computer("rick");
                if(playerCount >= 2){
                    comp1.setName(player2Name.getText());
                    if(playerCount >= 3){
                        comp2.setName(player3Name.getText());
                        if(playerCount == 4){
                            comp3.setName(player4Name.getText());
                        }
                    }
                }
                play2Name.setText(comp1.getName());
                play3Name.setText(comp2.getName());
                play4Name.setText(comp3.getName());
                for(int i = 0; i < player1UpperLabels.length; i++){
                    playGame.add(player1UpperLabels[i]);
                }
                playGame.add(new JLabel(blankicon));
                for(int i = player2UpperLabels.length - 1; i >= 0; i--){
                    playGame.add(player2UpperLabels[i]);
                }
                for(int i = 0; i < player1LowerLabels.length; i++){
                    playGame.add(player1LowerLabels[i]);
                }
                playGame.add(new JLabel(blankicon));
                for(int i = player2LowerLabels.length - 1; i >= 0; i--){
                    playGame.add(player2LowerLabels[i]);
                }
                for(int i = 1; i <= 17; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(firstDie);
                playGame.add(secondDie);
                playGame.add(thirdDie);
                playGame.add(fourthDie);
                playGame.add(fifthDie);
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(new JLabel("1"));
                playGame.add(new JLabel("2"));
                playGame.add(new JLabel("3"));
                playGame.add(new JLabel("4"));
                playGame.add(new JLabel("5"));
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(onesButton);
                playGame.add(twosButton);
                for(int i = 1; i <= 7; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(threeKindButton);
                playGame.add(smallStraightButton);
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(threesButton);
                playGame.add(foursButton);
                playGame.add(new JLabel(blankicon));
                playGame.add(saveOne);
                playGame.add(saveTwo);
                playGame.add(saveThree);
                playGame.add(saveFour);
                playGame.add(saveFive);
                playGame.add(new JLabel(blankicon));
                playGame.add(fourKindButton);
                playGame.add(largeStraightButton);
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(fivesButton);
                playGame.add(sixesButton);
                for(int i = 1; i <= 7; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(fullHouseButton);
                playGame.add(chanceButton);
                for(int i = 1; i <= 3; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                playGame.add(yahtzeeButton);
                playGame.add(new JLabel(blankicon));
                playGame.add(rollButton);
                playGame.add(new JLabel(blankicon));
                playGame.add(resetSaved);
                for(int i = 1; i <= 6; i++){
                    playGame.add(new JLabel(blankicon));
                }
                for(int i = 1; i <= 17; i++){
                    playGame.add(new JLabel(blankicon));
                }
                if(playerCount >= 3){
                    for(int i = 0; i < player3UpperLabels.length; i++){
                        playGame.add(player3UpperLabels[i]);
                    }
                    playGame.add(new JLabel(blankicon));
                    if(playerCount == 4){
                        for(int i = 0; i < player4UpperLabels.length; i++){
                            playGame.add(player4UpperLabels[i]);
                        }
                    }
                    else{
                        for(int i = player4UpperLabels.length; i >= 0; i--){
                            playGame.add(new JLabel(blankicon));
                        }
                    }
                    for(int i = 0; i < player3LowerLabels.length; i++){
                        playGame.add(player3LowerLabels[i]);
                    }
                    playGame.add(new JLabel(blankicon));
                    if(playerCount == 4){
                        for(int i = player4LowerLabels.length; i >= 0; i--){
                            playGame.add(player4LowerLabels[i]);
                        }
                    }
                    else{
                        for(int i = 0; i < player4UpperLabels.length; i++){
                            playGame.add(new JLabel(blankicon));
                        }
                    }
                }
                else{
                    for(int i = 1; i <= 17; i++){
                        playGame.add(new JLabel(blankicon));
                    }
                    for(int i = 1; i <= 17; i++){
                        playGame.add(new JLabel(blankicon));
                    }
                }

                game.add(playGame);
                applyNames.setVisible(false);
                game.setVisible(true);
            }
        });
      
        panel.add(askPlayerCount);
        panel.add(getPlayerCount);
        panel.add(submit);
        frame.add(panel);
        frame.setVisible(true);

    }
}