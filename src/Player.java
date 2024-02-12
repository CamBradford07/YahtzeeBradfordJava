public class Player {
  private int rollCount;
  private String name;
  private boolean onesDone;
  private boolean twosDone;
  private boolean threesDone;
  private boolean foursDone;
  private boolean fivesDone;
  private boolean sixesDone;
  private boolean threeKindDone;
  private boolean fourKindDone;
  private boolean fullHouseDone;
  private boolean smallStraightDone;
  private boolean largeStraightDone;
  private boolean chanceDone;
  private boolean yahtzeeDone;
  private int upperScore;
  private int totalScore;
  private int oneCount;
  private int twoCount;
  private int threeCount;
  private int fourCount;
  private int fiveCount;
  private int sixCount;
  private boolean oneSaved;
  private boolean twoSaved;
  private boolean threeSaved;
  private boolean fourSaved;
  private boolean fiveSaved;

  private boolean[] saved = {
    oneSaved,
    twoSaved,
    threeSaved,
    fourSaved,
    fiveSaved
  };
  private int[] roll = {
    0,
    0,
    0,
    0,
    0
  };

  public Player(String name) {
    this.name = name;
    onesDone = false;
    twosDone = false;
    threesDone = false;
    foursDone = false;
    fivesDone = false;
    sixesDone = false;
    fullHouseDone = false;
    fourKindDone = false;
    threeKindDone = false;
    smallStraightDone = false;
    largeStraightDone = false;
    yahtzeeDone = false;
    chanceDone = false;
  }

  public int[] roll() {
    oneCount = 0;
    twoCount = 0;
    threeCount = 0;
    fourCount = 0;
    fiveCount = 0;
    sixCount = 0;
    for (int i = 0; i < roll.length; i++) {
      if (saved[i] == false) {
        roll[i] = (int)(Math.random() * 6 + 1);
      }
    }
    for(int x: roll){
      if(x == 1){oneCount++;}
      else if(x == 2){twoCount++;}
      else if(x == 3){threeCount++;}
      else if(x == 4){fourCount++;}
      else if(x == 5){fiveCount++;}
      else{sixCount++;}
    }
    rollCount++;
    return roll;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setSave(int index, boolean tof) {
    saved[index] = tof;
  }

  public boolean getSave(int index) {
    return saved[index];
  }

  public int getScore() {
    return totalScore;
  }

  public boolean checkWin() {
    boolean[] dones = {onesDone,twosDone,threesDone,foursDone,fivesDone,sixesDone,smallStraightDone,largeStraightDone, threeKindDone, fourKindDone, fullHouseDone, yahtzeeDone, chanceDone};
    boolean won = true;
    for (boolean x: dones) {
      if (x == false) {
        won = false;
        break;
      }
    }
    return won;
  }

  public int getRollCount() {
    return rollCount;
  }

  public boolean checkYahtzee() {
    if (oneCount == 5) {
      return true;
    } else if (twoCount == 5) {
      return true;
    } else if (threeCount == 5) {
      return true;
    } else if (fourCount == 5) {
      return true;
    } else if (fiveCount == 5) {
      return true;
    } else if (sixCount == 5) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkFourKind() {
    if (fourKindDone == false) {
      if (oneCount >= 4) {
        return true;
      } else if (twoCount >= 4) {
        return true;
      } else if (threeCount >= 4) {
        return true;
      } else if (fourCount >= 4) {
        return true;
      } else if (fiveCount >= 4) {
        return true;
      } else if (sixCount >= 4) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean checkThreeKind() {
    if (threeKindDone == false) {
      if (oneCount >= 3) {
        return true;
      } else if (twoCount >= 3) {
        return true;
      } else if (threeCount >= 3) {
        return true;
      } else if (fourCount >= 3) {
        return true;
      } else if (fiveCount >= 3) {
        return true;
      } else if (sixCount >= 3) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean checkSmallStraight() {
    if (smallStraightDone == false) {
      if (oneCount >= 1 && twoCount >= 1 && threeCount >= 1 && fourCount >= 1) {
        return true;
      } else if (twoCount >= 1 & threeCount >= 1 && fourCount >= 1 && fiveCount >= 1) {
        return true;
      } else if (threeCount >= 1 && fourCount >= 1 && fiveCount >= 1 && sixCount >= 1 && smallStraightDone == false) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
  public boolean checkLargeStraight() {
    if (largeStraightDone == false) {
      if (oneCount == 1 && twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1) {
        return true;
      } else if (twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1 && sixCount == 1) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean checkFullHouse() {
    if (fullHouseDone == false) {
      if (oneCount == 3) {
        if (twoCount == 2) {
          return true;
        } else if (threeCount == 2) {
          return true;
        } else if (fourCount == 2) {
          return true;
        } else if (fiveCount == 2) {
          return true;
        } else if (sixCount == 2) {
          return true;
        } else {
          return false;
        }
      } else if (twoCount == 3) {
        if (oneCount == 2) {
          return true;
        } else if (threeCount == 2) {
          return true;
        } else if (fourCount == 2) {
          return true;
        } else if (fiveCount == 2) {
          return true;
        } else if (sixCount == 2) {
          return true;
        } else {
          return false;
        }
      } else if (threeCount == 3) {
        if (twoCount == 2) {
          return true;
        } else if (oneCount == 2) {
          return true;
        } else if (fourCount == 2) {
          return true;
        } else if (fiveCount == 2) {
          return true;
        } else if (sixCount == 2) {
          return true;
        } else {
          return false;
        }
      } else if (fourCount == 3) {
        if (twoCount == 2) {
          return true;
        } else if (threeCount == 2) {
          return true;
        } else if (oneCount == 2) {
          return true;
        } else if (fiveCount == 2) {
          return true;
        } else if (sixCount == 2) {
          return true;
        } else {
          return false;
        }
      } else if (fiveCount == 3) {
        if (twoCount == 2) {
          return true;
        } else if (threeCount == 2) {
          return true;
        } else if (fourCount == 2) {
          return true;
        } else if (oneCount == 2) {
          return true;
        } else if (sixCount == 2) {
          return true;
        } else {
          return false;
        }
      } else if (sixCount == 3) {
        if (twoCount == 2) {
          return true;
        } else if (threeCount == 2) {
          return true;
        } else if (fourCount == 2) {
          return true;
        } else if (fiveCount == 2) {
          return true;
        } else if (oneCount == 2) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean checkOnes() {
    if (onesDone == false && oneCount >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkTwos() {
    if (twosDone == false && twoCount >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkThrees() {
    if (threesDone == false && threeCount >= 1) {
      return true;
    } else {
      return false;
    }
  }
  public boolean checkFours() {
    if (foursDone == false && fourCount >= 1) {
      return true;
    } else {
      return false;
    }
  }
  public boolean checkFives() {
    if (fivesDone == false && fiveCount >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkSixes() {
    if (sixesDone == false && sixCount >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkChance() {
    if (chanceDone == false) {
      return true;
    } else {
      return false;
    }
  }

  public void completeOnes() {
    onesDone = true;
    totalScore += oneCount;
    upperScore += oneCount;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeTwos() {
    twosDone = true;
    totalScore += twoCount * 2;
    upperScore += twoCount * 2;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeThrees() {
    threesDone = true;
    totalScore += threeCount * 3;
    upperScore += threeCount * 3;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeFours() {
    foursDone = true;
    totalScore += fourCount * 4;
    upperScore += fourCount * 4;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeFives() {
    fivesDone = true;
    totalScore += fiveCount * 5;
    upperScore += fiveCount * 5;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeSixes() {
    sixesDone = true;
    totalScore += sixCount * 6;
    upperScore += sixCount * 6;
    if (checkBonus() == true) {
      totalScore += 35;
    }
  }

  public void completeYahtzee() {
    yahtzeeDone = true;
    totalScore += 50;
  }

  public void completeThreeKind() {
    threeKindDone = true;
    for (int x: roll) {
      totalScore += x;
    }
  }
  public void completeFourKind() {
    fourKindDone = true;
    for (int x: roll) {
      totalScore += x;
    }
  }

  public void completeChance() {
    chanceDone = true;
    for (int x: roll) {
      totalScore += x;
    }
  }

  public void completeSmallStraight() {
    smallStraightDone = true;
    totalScore += 30;
  }

  public void completeLargeStraight() {
    largeStraightDone = true;
    totalScore += 40;
  }

  public void completeFullHouse() {
    fullHouseDone = true;
    totalScore += 25;
  }

  public boolean checkBonus() {
    if (onesDone == true && twosDone == true && threesDone == true && foursDone == true && fivesDone == true && sixesDone == true) {
      if (upperScore >= 63) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean getYahtzeeDone(){
    return yahtzeeDone;
  }

  public void resetRollCount(){
    rollCount = 0;
    \\
  }
}