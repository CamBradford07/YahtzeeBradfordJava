import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Play Yahtzee");
    frame.setSize(500, 500);
    JFrame applyNames = new JFrame("Enter Names");
    applyNames.setSize(500, 500);
    JFrame game = new JFrame("Play Yahtzee");
    game.setSize(1500, 750);
    JFrame win = new JFrame("Winner");

    JPanel panel = new JPanel(new GridLayout(3, 1));
    JPanel getNames = new JPanel(new GridLayout(6, 1));
    JPanel playGame = new JPanel(new GridLayout(12, 17));
    JPanel showWinner = new JPanel(new GridLayout(2, 1));

    JLabel winner = new JLabel("");

    JLabel askPlayerCount = new JLabel("How many computers do you want to play against? 1-3");
    JTextField getPlayerCount = new JTextField();
    JButton submit = new JButton("Submit");

    JLabel text = new JLabel("Enter names");

    JTextField player1Name = new JTextField("Your Name");
    JTextField player2Name = new JTextField("Computer 1");
    JTextField player3Name = new JTextField("Computer 2");
    JTextField player4Name = new JTextField("Computer 3");
    JTextField[] nameFields = {
      player1Name,
      player2Name,
      player3Name,
      player4Name
    };

    ImageIcon die1icon = new ImageIcon("Images/1die.png");
    die1icon.setImage(die1icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
    ImageIcon die2icon = new ImageIcon("Images/2die.png");
    die2icon.setImage(die2icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
    ImageIcon die3icon = new ImageIcon("Images/3die.png");
    die3icon.setImage(die3icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
    ImageIcon die4icon = new ImageIcon("Images/4die.png");
    die4icon.setImage(die4icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
    ImageIcon die5icon = new ImageIcon("Images/5die.png");
    die5icon.setImage(die5icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
    ImageIcon die6icon = new ImageIcon("Images/6die.png");
    die6icon.setImage(die6icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));

    ImageIcon blankicon = new ImageIcon("Images/blank.png");
    blankicon.setImage(blankicon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    JLabel firstDie = new JLabel(die1icon);
    JLabel secondDie = new JLabel(die1icon);
    JLabel thirdDie = new JLabel(die1icon);
    JLabel fourthDie = new JLabel(die1icon);
    JLabel fifthDie = new JLabel(die1icon);
    JLabel[] dieImages = {
      firstDie,
      secondDie,
      thirdDie,
      fourthDie,
      fifthDie
    };

    JButton rollButton = new JButton("Roll");
    JButton onesButton = new JButton("ones");
    JButton twosButton = new JButton("twos");
    JButton threesButton = new JButton("threes");
    JButton foursButton = new JButton("fours");
    JButton fivesButton = new JButton("fives");
    JButton sixesButton = new JButton("sixes");

    JButton threeKindButton = new JButton("3 Set");
    JButton fourKindButton = new JButton("4 Set");
    JButton smallStraightButton = new JButton("S Run");
    JButton largeStraightButton = new JButton("L Run");
    JButton fullHouseButton = new JButton("Full House");
    JButton yahtzeeButton = new JButton("Yahtzee");
    JButton chanceButton = new JButton("Chance");

    JButton resetSaved = new JButton("reset saved");
    JButton saveOne = new JButton("save 1");
    JButton saveTwo = new JButton("save 2");
    JButton saveThree = new JButton("save 3");
    JButton saveFour = new JButton("save 4");
    JButton saveFive = new JButton("save 5");

    JButton resetGame = new JButton("Start new Game");

    JLabel play1Name = new JLabel("");
    JLabel play1Bonus = new JLabel("Bonus: ");
    JLabel play1Ones = new JLabel("Ones: ");
    JLabel play1Twos = new JLabel("Twos: ");
    JLabel play1Threes = new JLabel("Threes: ");
    JLabel play1Fours = new JLabel("Fours: ");
    JLabel play1Fives = new JLabel("Fives: ");
    JLabel play1Sixes = new JLabel("Sixes: ");
    JLabel play1SmallStraight = new JLabel("S Run: ");
    JLabel play1LargeStraight = new JLabel("L Run: ");
    JLabel play1Chance = new JLabel("Chance: ");
    JLabel play1FourKind = new JLabel("4 Set: ");
    JLabel play1ThreeKind = new JLabel("3 Set: ");
    JLabel play1Yahtzee = new JLabel("Yahtzee: ");
    JLabel play1FullHouse = new JLabel("Full: ");
    JLabel play1Score = new JLabel("Score: 0");

    JLabel play2Name = new JLabel("");
    JLabel play2Bonus = new JLabel("Bonus: ");
    JLabel play2Ones = new JLabel("Ones: ");
    JLabel play2Twos = new JLabel("Twos: ");
    JLabel play2Threes = new JLabel("Threes: ");
    JLabel play2Fours = new JLabel("Fours: ");
    JLabel play2Fives = new JLabel("Fives: ");
    JLabel play2Sixes = new JLabel("Sixes: ");
    JLabel play2SmallStraight = new JLabel("S Run: ");
    JLabel play2LargeStraight = new JLabel("L Run: ");
    JLabel play2Chance = new JLabel("Chance: ");
    JLabel play2FourKind = new JLabel("4 Set: ");
    JLabel play2ThreeKind = new JLabel("3 Set: ");
    JLabel play2Yahtzee = new JLabel("Yahtzee: ");
    JLabel play2FullHouse = new JLabel("Full: ");
    JLabel play2Score = new JLabel("Score: 0");

    JLabel play3Name = new JLabel("");
    JLabel play3Bonus = new JLabel("Bonus: ");
    JLabel play3Ones = new JLabel("Ones: ");
    JLabel play3Twos = new JLabel("Twos: ");
    JLabel play3Threes = new JLabel("Threes: ");
    JLabel play3Fours = new JLabel("Fours: ");
    JLabel play3Fives = new JLabel("Fives: ");
    JLabel play3Sixes = new JLabel("Sixes: ");
    JLabel play3SmallStraight = new JLabel("S Run: ");
    JLabel play3LargeStraight = new JLabel("L Run: ");
    JLabel play3Chance = new JLabel("Chance: ");
    JLabel play3FourKind = new JLabel("4 Set: ");
    JLabel play3ThreeKind = new JLabel("3 Set: ");
    JLabel play3Yahtzee = new JLabel("Yahtzee: ");
    JLabel play3FullHouse = new JLabel("Full: ");
    JLabel play3Score = new JLabel("Score: 0");

    JLabel play4Name = new JLabel("");
    JLabel play4Bonus = new JLabel("Bonus: ");
    JLabel play4Ones = new JLabel("Ones: ");
    JLabel play4Twos = new JLabel("Twos: ");
    JLabel play4Threes = new JLabel("Threes: ");
    JLabel play4Fours = new JLabel("Fours: ");
    JLabel play4Fives = new JLabel("Fives: ");
    JLabel play4Sixes = new JLabel("Sixes: ");
    JLabel play4SmallStraight = new JLabel("S Run: ");
    JLabel play4LargeStraight = new JLabel("L Run: ");
    JLabel play4Chance = new JLabel("Chance: ");
    JLabel play4FourKind = new JLabel("4 Set: ");
    JLabel play4ThreeKind = new JLabel("3 Set: ");
    JLabel play4Yahtzee = new JLabel("Yahtzee: ");
    JLabel play4FullHouse = new JLabel("Full: ");
    JLabel play4Score = new JLabel("Score: 0");

    JLabel[] player1UpperLabels = {
      play1Name,
      play1Ones,
      play1Twos,
      play1Threes,
      play1Fours,
      play1Fives,
      play1Sixes,
      play1Bonus
    };
    JLabel[] player1LowerLabels = {
      play1Score,
      play1ThreeKind,
      play1FourKind,
      play1FullHouse,
      play1SmallStraight,
      play1LargeStraight,
      play1Chance,
      play1Yahtzee
    };

    JLabel[] player2UpperLabels = {
      play2Name,
      play2Ones,
      play2Twos,
      play2Threes,
      play2Fours,
      play2Fives,
      play2Sixes,
      play2Bonus
    };
    JLabel[] player2LowerLabels = {
      play2Score,
      play2ThreeKind,
      play2FourKind,
      play2FullHouse,
      play2SmallStraight,
      play2LargeStraight,
      play2Chance,
      play2Yahtzee
    };

    JLabel[] player3UpperLabels = {
      play3Name,
      play3Ones,
      play3Twos,
      play3Threes,
      play3Fours,
      play3Fives,
      play3Sixes,
      play3Bonus
    };
    JLabel[] player3LowerLabels = {
      play3Score,
      play3ThreeKind,
      play3FourKind,
      play3FullHouse,
      play3SmallStraight,
      play3LargeStraight,
      play3Chance,
      play3Yahtzee
    };

    JLabel[] player4UpperLabels = {
      play4Name,
      play4Ones,
      play4Twos,
      play4Threes,
      play4Fours,
      play4Fives,
      play4Sixes,
      play4Bonus
    };
    JLabel[] player4LowerLabels = {
      play4Score,
      play4ThreeKind,
      play4FourKind,
      play4FullHouse,
      play4SmallStraight,
      play4LargeStraight,
      play4Chance,
      play4Yahtzee
    };

    JLabel[] computerYahtzees = {
      play2Yahtzee,
      play3Yahtzee,
      play4Yahtzee
    };
    JLabel[] computerSmallStraight = {
      play2SmallStraight,
      play3SmallStraight,
      play4SmallStraight
    };
    JLabel[] computerLargeStraight = {
      play2LargeStraight,
      play3LargeStraight,
      play4LargeStraight
    };
    JLabel[] computerThreeKinds = {
      play2ThreeKind,
      play3ThreeKind,
      play4ThreeKind
    };
    JLabel[] computerFourKinds = {
      play2FourKind,
      play3FourKind,
      play4FourKind
    };
    JLabel[] computerFullHouses = {
      play2FullHouse,
      play3FullHouse,
      play4FullHouse
    };
    JLabel[] computerChances = {
      play2Chance,
      play3Chance,
      play4Chance
    };
    JLabel[] computerOnes = {
      play2Ones,
      play3Ones,
      play4Ones
    };
    JLabel[] computerTwos = {
      play2Twos,
      play3Twos,
      play4Twos
    };
    JLabel[] computerThrees = {
      play2Threes,
      play3Threes,
      play4Threes
    };
    JLabel[] computerFours = {
      play2Fours,
      play3Fours,
      play4Fours
    };
    JLabel[] computerFives = {
      play2Fives,
      play3Fives,
      play4Fives
    };
    JLabel[] computerSixes = {
      play2Sixes,
      play3Sixes,
      play4Sixes
    };
    JLabel[] computerBonuses = {
      play2Bonus,
      play3Bonus,
      play4Bonus
    };
    JLabel[] computerScores = {
      play2Score,
      play3Score,
      play4Score
    };

    saveOne.setVisible(false);
    saveTwo.setVisible(false);
    saveThree.setVisible(false);
    saveFour.setVisible(false);
    saveFive.setVisible(false);

    JButton submitNames = new JButton("Submit names");

    submit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int playercount = 0;

        try {
          playercount = Integer.parseInt(getPlayerCount.getText());
          if (playercount > 3 || playercount < 1) {
            askPlayerCount.setText("Invalid Number try again, pick 1-3");
          } else {
            getNames.add(text);
            for (int i = 0; i <= playercount; i++) {
              getNames.add(nameFields[i]);
            }
            getNames.add(submitNames);
            applyNames.add(getNames);
            frame.setVisible(false);
            applyNames.setVisible(true);
          }
        } catch (NumberFormatException numExcept) {
          askPlayerCount.setText("Invalid Number try again, pick 1-3");
        }

      }
    });

    Computer comp1 = new Computer("Seaver");
    Computer comp2 = new Computer("Alex");
    Computer comp3 = new Computer("rick");
    Player play = new Player("LOSER");

    ArrayList < Computer > comps = new ArrayList < Computer > ();
    submitNames.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int playerCount = Integer.parseInt(getPlayerCount.getText()) + 1;
        play.setName(player1Name.getText());
        play1Name.setText(play.getName());

        if (playerCount >= 2) {
          comp1.setName(player2Name.getText());
          comps.add(comp1);
          if (playerCount >= 3) {
            comp2.setName(player3Name.getText());
            comps.add(comp2);
            if (playerCount == 4) {
              comp3.setName(player4Name.getText());
              comps.add(comp3);
            }
          }
        }
        play2Name.setText(comp1.getName());
        play3Name.setText(comp2.getName());
        play4Name.setText(comp3.getName());
        for (int i = 0; i < player1UpperLabels.length; i++) {
          playGame.add(player1UpperLabels[i]);
        }
        playGame.add(new JLabel(blankicon));
        for (int i = player2UpperLabels.length - 1; i >= 0; i--) {
          playGame.add(player2UpperLabels[i]);
        }
        for (int i = 0; i < player1LowerLabels.length; i++) {
          playGame.add(player1LowerLabels[i]);
        }
        playGame.add(new JLabel(blankicon));
        for (int i = player2LowerLabels.length - 1; i >= 0; i--) {
          playGame.add(player2LowerLabels[i]);
        }
        for (int i = 1; i <= 17; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(firstDie);
        playGame.add(secondDie);
        playGame.add(thirdDie);
        playGame.add(fourthDie);
        playGame.add(fifthDie);
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(new JLabel("1"));
        playGame.add(new JLabel("2"));
        playGame.add(new JLabel("3"));
        playGame.add(new JLabel("4"));
        playGame.add(new JLabel("5"));
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 3; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(onesButton);
        playGame.add(twosButton);
        for (int i = 1; i <= 7; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(threeKindButton);
        playGame.add(smallStraightButton);
        for (int i = 1; i <= 3; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 3; i++) {
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
        for (int i = 1; i <= 3; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 3; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(fivesButton);
        playGame.add(sixesButton);
        for (int i = 1; i <= 7; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(fullHouseButton);
        playGame.add(chanceButton);
        for (int i = 1; i <= 3; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        playGame.add(yahtzeeButton);
        playGame.add(new JLabel(blankicon));
        playGame.add(rollButton);
        playGame.add(new JLabel(blankicon));
        playGame.add(resetSaved);
        for (int i = 1; i <= 6; i++) {
          playGame.add(new JLabel(blankicon));
        }
        for (int i = 1; i <= 17; i++) {
          playGame.add(new JLabel(blankicon));
        }
        if (playerCount >= 3) {
          for (int i = 0; i < player3UpperLabels.length; i++) {
            playGame.add(player3UpperLabels[i]);
          }
          playGame.add(new JLabel(blankicon));
          if (playerCount == 4) {
            for (int i = player4UpperLabels.length - 1; i >= 0; i--) {
              playGame.add(player4UpperLabels[i]);
            }
          } else {
            for (int i = player4UpperLabels.length - 1; i >= 0; i--) {
              playGame.add(new JLabel(blankicon));
            }
          }
          for (int i = 0; i < player3LowerLabels.length; i++) {
            playGame.add(player3LowerLabels[i]);
          }
          playGame.add(new JLabel(blankicon));
          if (playerCount == 4) {
            for (int i = player4LowerLabels.length - 1; i >= 0; i--) {
              playGame.add(player4LowerLabels[i]);
            }
          } else {
            for (int i = 0; i < player4UpperLabels.length; i++) {
              playGame.add(new JLabel(blankicon));
            }
          }
        } else {
          for (int i = 1; i <= 17; i++) {
            playGame.add(new JLabel(blankicon));
          }
          for (int i = 1; i <= 17; i++) {
            playGame.add(new JLabel(blankicon));
          }
        }

        game.add(playGame);
        applyNames.setVisible(false);
        game.setVisible(true);
      }
    });

    rollButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int[] roll = play.roll();
        for (int i = 0; i < roll.length; i++) {
          if (roll[i] == 1) {
            dieImages[i].setIcon(die1icon);
          } else if (roll[i] == 2) {
            dieImages[i].setIcon(die2icon);
          } else if (roll[i] == 3) {
            dieImages[i].setIcon(die3icon);
          } else if (roll[i] == 4) {
            {
              dieImages[i].setIcon(die4icon);
            }
          } else if (roll[i] == 5) {
            dieImages[i].setIcon(die5icon);
          } else {
            dieImages[i].setIcon(die6icon);
          }
        }
        for (int i = 0; i < 5; i++) {
          play.setSave(i, false);
        }
        saveOne.setVisible(true);
        saveTwo.setVisible(true);
        saveThree.setVisible(true);
        saveFour.setVisible(true);
        saveFive.setVisible(true);
        if (play.checkYahtzee() == true) {
          yahtzeeButton.setVisible(true);
        } else {
          yahtzeeButton.setVisible(false);
        }
        if (play.checkFourKind() == true) {
          fourKindButton.setVisible(true);
        } else {
          fourKindButton.setVisible(false);
        }
        if (play.checkThreeKind() == true) {
          threeKindButton.setVisible(true);
        } else {
          threeKindButton.setVisible(false);
        }
        if (play.checkFullHouse() == true) {
          fullHouseButton.setVisible(true);
        } else {
          fullHouseButton.setVisible(false);
        }
        if (play.checkSmallStraight() == true) {
          smallStraightButton.setVisible(true);
        } else {
          smallStraightButton.setVisible(false);
        }
        if (play.checkLargeStraight() == true) {
          largeStraightButton.setVisible(true);
        } else {
          largeStraightButton.setVisible(false);
        }
        if (play.checkChance() == true) {
          chanceButton.setVisible(true);
        } else {
          chanceButton.setVisible(false);
        }
        if (play.checkOnes() == true) {
          onesButton.setVisible(true);
        } else {
          onesButton.setVisible(false);
        }
        if (play.checkTwos() == true) {
          twosButton.setVisible(true);
        } else {
          twosButton.setVisible(false);
        }
        if (play.checkThrees() == true) {
          threesButton.setVisible(true);
        } else {
          threesButton.setVisible(false);
        }
        if (play.checkFours() == true) {
          foursButton.setVisible(true);
        } else {
          foursButton.setVisible(false);
        }
        if (play.checkFives() == true) {
          fivesButton.setVisible(true);
        } else {
          fivesButton.setVisible(false);
        }
        if (play.checkSixes() == true) {
          sixesButton.setVisible(true);
        } else {
          sixesButton.setVisible(false);
        }

        if (play.getRollCount() >= 3) {
          rollButton.setVisible(false);
          saveOne.setVisible(false);
          saveTwo.setVisible(false);
          saveThree.setVisible(false);
          saveFour.setVisible(false);
          saveFive.setVisible(false);
          resetSaved.setVisible(false);
          for (int i = 0; i < comps.size(); i++) {
            int[] computerRolled = new int[5];
            boolean tookTurn = false;
            while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
              computerRolled = comps.get(i).roll();
              for (int x = 0; x < computerRolled.length; x++) {
                if (computerRolled[x] == 1) {
                  dieImages[x].setIcon(die1icon);
                } else if (computerRolled[i] == 2) {
                  dieImages[x].setIcon(die2icon);
                } else if (computerRolled[i] == 3) {
                  dieImages[x].setIcon(die3icon);
                } else if (computerRolled[i] == 4) {
                    dieImages[x].setIcon(die4icon);
                } else if (computerRolled[i] == 5) {
                  dieImages[i].setIcon(die5icon);
                } else {
                  dieImages[i].setIcon(die6icon);
                }
              }
              tookTurn = comps.get(i).takeTurn();
            }
            if (comps.get(i).getYahtzeeDone() == true) {
              computerYahtzees[i].setText("Yahtzee: ✓");
            }
            if (comps.get(i).getChanceDone() == true) {
              computerChances[i].setText("Chance: ✓");
            }
            if (comps.get(i).getThreeKindDone() == true) {
              computerThreeKinds[i].setText("3 Set: ✓");
            }
            if (comps.get(i).getFourKindDone() == true) {
              computerFourKinds[i].setText("4 Set: ✓");
            }
            if (comps.get(i).getFullHouseDone() == true) {
              computerFullHouses[i].setText("Full: ✓");
            }
            if (comps.get(i).getSmallStraightDone() == true) {
              computerSmallStraight[i].setText("S Run: ✓");
            }
            if (comps.get(i).getLargeStraightDone() == true) {
              computerLargeStraight[i].setText("R Run: ✓");
            }
            if (comps.get(i).getOnesDone() == true) {
              computerOnes[i].setText("Ones: ✓");
            }
            if (comps.get(i).getTwosDone() == true) {
              computerTwos[i].setText("Twos: ✓");
            }
            if (comps.get(i).getThreesDone() == true) {
              computerThrees[i].setText("Threes: ✓");
            }
            if (comps.get(i).getFoursDone() == true) {
              computerFours[i].setText("Fours: ✓");
            }
            if (comps.get(i).getFivesDone() == true) {
              computerFives[i].setText("Fives: ✓");
            }
            if (comps.get(i).getSixesDone() == true) {
              computerSixes[i].setText("Sixes: ✓");
            }
            if (comps.get(i).getBonusDone() == true) {
              computerBonuses[i].setText("Bonus: ✓");
            }
            computerScores[i].setText("Scores: " + comps.get(i).getScore());
          }
        }
      }
    });

    saveOne.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        play.setSave(0, true);
        saveOne.setVisible(false);
      }
    });

    saveTwo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        play.setSave(1, true);
        saveTwo.setVisible(false);
      }
    });

    saveThree.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        play.setSave(2, true);
        saveThree.setVisible(false);
      }
    });

    saveFour.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        play.setSave(3, true);
        saveFour.setVisible(false);
      }
    });

    saveFive.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        play.setSave(4, true);
        saveFive.setVisible(false);
      }
    });

    resetSaved.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 5; i++) {
          play.setSave(i, false);

        }
        saveOne.setVisible(true);
        saveTwo.setVisible(true);
        saveThree.setVisible(true);
        saveFour.setVisible(true);
        saveFive.setVisible(true);
      }
    });

    onesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          play.completeOnes();
          play1Ones.setText(play1Ones.getText() + "✓");
          boolean playerWin = play.checkWin();
          if (playerWin == true) {
            winner.setText("Winner is " + play.getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
          chanceButton.setVisible(false);
          onesButton.setVisible(false);
          twosButton.setVisible(false);
          threesButton.setVisible(false);
          foursButton.setVisible(false);
          fivesButton.setVisible(false);
          sixesButton.setVisible(false);
          threeKindButton.setVisible(false);
          fourKindButton.setVisible(false);
          fullHouseButton.setVisible(false);
          smallStraightButton.setVisible(false);
          largeStraightButton.setVisible(false);
          yahtzeeButton.setVisible(false);
          play1Score.setText("Score: " + play.getScore());
          if (play.checkBonus() == true) {
            play1Bonus.setText("Bonus: ✓");
          }
          for (int i = 0; i < comps.size(); i++) {
            int[] computerRolled = new int[5];
            boolean tookTurn = false;
            while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
              computerRolled = comps.get(i).roll();
              for (int x = 0; x < computerRolled.length; x++) {
                if (computerRolled[x] == 1) {
                  dieImages[x].setIcon(die1icon);
                } else if (computerRolled[i] == 2) {
                  dieImages[x].setIcon(die2icon);
                } else if (computerRolled[i] == 3) {
                  dieImages[x].setIcon(die3icon);
                } else if (computerRolled[i] == 4) {
                  {
                    dieImages[x].setIcon(die4icon);
                  }
                } else if (computerRolled[i] == 5) {
                  dieImages[i].setIcon(die5icon);
                } else {
                  dieImages[i].setIcon(die6icon);
                }
              }
              tookTurn = comps.get(i).takeTurn();
            }
            if (comps.get(i).getYahtzeeDone() == true) {
              computerYahtzees[i].setText("Yahtzee: ✓");
            }
            if (comps.get(i).getChanceDone() == true) {
              computerChances[i].setText("Chance: ✓");
            }
            if (comps.get(i).getThreeKindDone() == true) {
              computerThreeKinds[i].setText("3 Set: ✓");
            }
            if (comps.get(i).getFourKindDone() == true) {
              computerFourKinds[i].setText("4 Set: ✓");
            }
            if (comps.get(i).getFullHouseDone() == true) {
              computerFullHouses[i].setText("Full: ✓");
            }
            if (comps.get(i).getSmallStraightDone() == true) {
              computerSmallStraight[i].setText("S Run: ✓");
            }
            if (comps.get(i).getLargeStraightDone() == true) {
              computerLargeStraight[i].setText("R Run: ✓");
            }
            if (comps.get(i).getOnesDone() == true) {
              computerOnes[i].setText("Ones: ✓");
            }
            if (comps.get(i).getTwosDone() == true) {
              computerTwos[i].setText("Twos: ✓");
            }
            if (comps.get(i).getThreesDone() == true) {
              computerThrees[i].setText("Threes: ✓");
            }
            if (comps.get(i).getFoursDone() == true) {
              computerFours[i].setText("Fours: ✓");
            }
            if (comps.get(i).getFivesDone() == true) {
              computerFives[i].setText("Fives: ✓");
            }
            if (comps.get(i).getSixesDone() == true) {
              computerSixes[i].setText("Sixes: ✓");
            }
            if (comps.get(i).getBonusDone() == true) {
              computerBonuses[i].setText("Bonus: ✓");
            }
            computerScores[i].setText("Scores: " + comps.get(i).getScore());
            boolean compWin = comps.get(i).checkWin();
            if (compWin == true) {
              winner.setText("Winner is " + comps.get(i).getName());
              showWinner.add(winner);
              showWinner.add(resetGame);
              win.add(showWinner);
              win.setSize(500, 250);
              win.setVisible(true);
              game.setVisible(false);
            }
          }
          play.resetRollCount();
          rollButton.setVisible(true);
          resetSaved.setVisible(true);
        }
      }

    );

    twosButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeTwos();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Twos.setText(play1Twos.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());
        if (play.checkBonus() == true) {
          play1Bonus.setText("Bonus: ✓");
        }

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    threesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeThrees();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Threes.setText(play1Threes.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());
        if (play.checkBonus() == true) {
          play1Bonus.setText("Bonus: ✓");
        }

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    foursButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeFours();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Fours.setText(play1Fours.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());
        if (play.checkBonus() == true) {
          play1Bonus.setText("Bonus: ✓");
        }

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    fivesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeFives();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Fives.setText(play1Fives.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());
        if (play.checkBonus() == true) {
          play1Bonus.setText("Bonus: ✓");
        }

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    sixesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeSixes();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Sixes.setText(play1Sixes.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());
        if (play.checkBonus() == true) {
          play1Bonus.setText("Bonus: ✓");
        }

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    yahtzeeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (play.getYahtzeeDone() == false) {
          play1Yahtzee.setText(play1Yahtzee.getText() + "✓");
        }
        play.completeYahtzee();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    smallStraightButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeSmallStraight();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1SmallStraight.setText(play1SmallStraight.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    largeStraightButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeLargeStraight();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1LargeStraight.setText(play1LargeStraight.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    fourKindButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeFourKind();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1FourKind.setText(play1FourKind.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    threeKindButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeThreeKind();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1ThreeKind.setText(play1ThreeKind.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    fullHouseButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeFullHouse();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1FullHouse.setText(play1FullHouse.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

    chanceButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        play.completeChance();
        boolean playerWin = play.checkWin();
        if (playerWin == true) {
          winner.setText("Winner is " + play.getName());
          showWinner.add(winner);
          showWinner.add(resetGame);
          win.add(showWinner);
          win.setSize(500, 250);
          win.setVisible(true);
          game.setVisible(false);
        }
        play1Chance.setText(play1Chance.getText() + "✓");
        chanceButton.setVisible(false);
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smallStraightButton.setVisible(false);
        largeStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        play1Score.setText("Score: " + play.getScore());

        for (int i = 0; i < comps.size(); i++) {
          int[] computerRolled = new int[5];
          boolean tookTurn = false;
          while (tookTurn == false && comps.get(i).getRollCount() <= 3) {
            computerRolled = comps.get(i).roll();
            for (int x = 0; x < computerRolled.length; x++) {
              if (computerRolled[x] == 1) {
                dieImages[x].setIcon(die1icon);
              } else if (computerRolled[i] == 2) {
                dieImages[x].setIcon(die2icon);
              } else if (computerRolled[i] == 3) {
                dieImages[x].setIcon(die3icon);
              } else if (computerRolled[i] == 4) {
                {
                  dieImages[x].setIcon(die4icon);
                }
              } else if (computerRolled[i] == 5) {
                dieImages[i].setIcon(die5icon);
              } else {
                dieImages[i].setIcon(die6icon);
              }
            }
            tookTurn = comps.get(i).takeTurn();
          }
          if (comps.get(i).getYahtzeeDone() == true) {
            computerYahtzees[i].setText("Yahtzee: ✓");
          }
          if (comps.get(i).getChanceDone() == true) {
            computerChances[i].setText("Chance: ✓");
          }
          if (comps.get(i).getThreeKindDone() == true) {
            computerThreeKinds[i].setText("3 Set: ✓");
          }
          if (comps.get(i).getFourKindDone() == true) {
            computerFourKinds[i].setText("4 Set: ✓");
          }
          if (comps.get(i).getFullHouseDone() == true) {
            computerFullHouses[i].setText("Full: ✓");
          }
          if (comps.get(i).getSmallStraightDone() == true) {
            computerSmallStraight[i].setText("S Run: ✓");
          }
          if (comps.get(i).getLargeStraightDone() == true) {
            computerLargeStraight[i].setText("R Run: ✓");
          }
          if (comps.get(i).getOnesDone() == true) {
            computerOnes[i].setText("Ones: ✓");
          }
          if (comps.get(i).getTwosDone() == true) {
            computerTwos[i].setText("Twos: ✓");
          }
          if (comps.get(i).getThreesDone() == true) {
            computerThrees[i].setText("Threes: ✓");
          }
          if (comps.get(i).getFoursDone() == true) {
            computerFours[i].setText("Fours: ✓");
          }
          if (comps.get(i).getFivesDone() == true) {
            computerFives[i].setText("Fives: ✓");
          }
          if (comps.get(i).getSixesDone() == true) {
            computerSixes[i].setText("Sixes: ✓");
          }
          if (comps.get(i).getBonusDone() == true) {
            computerBonuses[i].setText("Bonus: ✓");
          }
          computerScores[i].setText("Scores: " + comps.get(i).getScore());
          boolean compWin = comps.get(i).checkWin();
          if (compWin == true) {
            winner.setText("Winner is " + comps.get(i).getName());
            showWinner.add(winner);
            showWinner.add(resetGame);
            win.add(showWinner);
            win.setSize(500, 250);
            win.setVisible(true);
            game.setVisible(false);
          }
        }
        play.resetRollCount();
        rollButton.setVisible(true);
        resetSaved.setVisible(true);
      }
    });

      resetGame.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
          win.setVisible(false);
            play1Name.setText("");
            play1Bonus.setText("Bonus: ");
            play1Ones.setText("Ones: ");
            play1Twos.setText("Twos: ");
            play1Threes.setText("Threes: ");
            play1Fours.setText("Fours: ");
            play1Fives.setText("Fives: ");
            play1Sixes.setText("Sixes: ");
            play1SmallStraight.setText("S Run: ");
            play1LargeStraight.setText("L Run: ");
            play1Chance.setText("Chance: ");
            play1FourKind.setText("4 Set: ");
            play1ThreeKind.setText("3 Set: ");
            play1Yahtzee.setText("Yahtzee: ");
            play1FullHouse.setText("Full: ");
            play1Score.setText("Score: 0");

            play2Name.setText("");
            play2Bonus.setText("Bonus: ");
            play2Ones.setText("Ones: ");
            play2Twos.setText("Twos: ");
            play2Threes.setText("Threes: ");
            play2Fours.setText("Fours: ");
            play2Fives.setText("Fives: ");
            play2Sixes.setText("Sixes: ");
            play2SmallStraight.setText("S Run: ");
            play2LargeStraight.setText("L Run: ");
            play2Chance.setText("Chance: ");
            play2FourKind.setText("4 Set: ");
            play2ThreeKind.setText("3 Set: ");
            play2Yahtzee.setText("Yahtzee: ");
            play2FullHouse.setText("Full: ");
            play2Score.setText("Score: 0");

            play3Name.setText("");
            play3Bonus.setText("Bonus: ");
            play3Ones.setText("Ones: ");
            play3Twos.setText("Twos: ");
            play3Threes.setText("Threes: ");
            play3Fours.setText("Fours: ");
            play3Fives.setText("Fives: ");
            play3Sixes.setText("Sixes: ");
            play3SmallStraight.setText("S Run: ");
            play3LargeStraight.setText("L Run: ");
            play3Chance.setText("Chance: ");
            play3FourKind.setText("4 Set: ");
            play3ThreeKind.setText("3 Set: ");
            play3Yahtzee.setText("Yahtzee: ");
            play3FullHouse.setText("Full: ");
            play3Score.setText("Score: 0");

            play4Name.setText("");
            play4Bonus.setText("Bonus: ");
            play4Ones.setText("Ones: ");
            play4Twos.setText("Twos: ");
            play4Threes.setText("Threes: ");
            play4Fours.setText("Fours: ");
            play4Fives.setText("Fives: ");
            play4Sixes.setText("Sixes: ");
            play4SmallStraight.setText("S Run: ");
            play4LargeStraight.setText("L Run: ");
            play4Chance.setText("Chance: ");
            play4FourKind.setText("4 Set: ");
            play4ThreeKind.setText("3 Set: ");
            play4Yahtzee.setText("Yahtzee: ");
            play4FullHouse.setText("Full: ");
            play4Score.setText("Score: 0");
            comp1.reset();
            comp2.reset();
            comp3.reset();
            play.reset();
            askPlayerCount.setText("How many computers do you want to play against? 1-3");
            firstDie.setIcon(die1icon);
            secondDie.setIcon(die1icon);
            thirdDie.setIcon(die1icon);
            fourthDie.setIcon(die1icon);
            fifthDie.setIcon(die1icon);
            frame.setVisible(true);
          }
        });
    
    panel.add(askPlayerCount);
    panel.add(getPlayerCount);
    panel.add(submit);
    frame.add(panel);
    frame.setVisible(true);

  }
}