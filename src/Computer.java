public class Computer {
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
  private boolean[] dones = {
    onesDone,
    twosDone,
    threesDone,
    foursDone,
    fivesDone,
    sixesDone,
    threeKindDone,
    fourKindDone,
    fullHouseDone,
    yahtzeeDone,
    chanceDone,
    smallStraightDone,
    largeStraightDone
  };
  private int[] roll = {
    0,
    0,
    0,
    0,
    0
  };

  public Computer(String name) {
    this.name = name;
    onesDone = false;
    twosDone = false;
    threesDone = false;
    foursDone = false;
    fivesDone = false;
    sixesDone = false;
    smallStraightDone = false;
    largeStraightDone = false;
    threeKindDone = false;
    fourKindDone = false;
    fullHouseDone = false;
    yahtzeeDone = false;
    chanceDone = false;
    upperScore = 0;
    totalScore = 0;

  }
  public int[] roll() {
    roll = new int[5];
    for (int i = 0; i < roll.length; i++) {
      roll[i] = (int)(Math.random() * 6 + 1);
    }
    return roll;
  }

  public void takeTurn() {
    oneCount = 0;
    twoCount = 0;
    threeCount = 0;
    fourCount = 0;
    fiveCount = 0;
    sixCount = 0;
    boolean fh = checkFullHouse();
    for (int x: roll) {
      if (x == 1) {
        oneCount++;
      } else if (x == 2) {
        twoCount++;
      } else if (x == 3) {
        threeCount++;
      } else if (x == 4) {
        fourCount++;
      } else if (x == 5) {
        fiveCount++;
      } else {
        sixCount++;
      }
    }
    if ((oneCount == 5 || twoCount == 5 || threeCount == 5 || fourCount == 5 || fiveCount == 5 || sixCount == 5)) {
      yahtzeeDone = true;
      totalScore += 50;
    } else if (((oneCount == 1 && twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1) || (twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1 && sixCount == 1)) && largeStraightDone == false) {
      largeStraightDone = true;
      totalScore += 40;
    } else if (((oneCount == 1 && twoCount == 1 && threeCount == 1 && fourCount == 1) || (twoCount == 1 & threeCount == 1 && fourCount == 1 && fiveCount == 1) || (threeCount == 1 && fourCount == 1 && fiveCount == 1 && sixCount == 1)) && smallStraightDone == false) {
      smallStraightDone = true;
      totalScore += 30;
    } else if (fh == true && fullHouseDone == false) {
      fullHouseDone = true;
      totalScore += 25;
    } else if ((oneCount >= 4 || twoCount >= 4 || threeCount >= 4 || fourCount >= 4 || fiveCount >= 4 || sixCount >= 4) && fourKindDone == false) {
      fourKindDone = true;
      for (int x: roll) {
        totalScore += x;
      }
    } else if ((oneCount >= 3 || twoCount >= 3 || threeCount >= 3 || fourCount >= 3 || fiveCount >= 3 || sixCount >= 3) && fourKindDone == false) {
      fourKindDone = true;
      for (int x: roll) {
        totalScore += x;
      }
    } else if (sixCount >= 3 && sixesDone == false) {
      sixesDone = true;
      totalScore += (6 * sixCount);
      upperScore += (6 * sixCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (fiveCount >= 3 && fivesDone == false) {
      fivesDone = true;
      totalScore += (5 * fiveCount);
      upperScore += (5 * fiveCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (fourCount >= 3 && foursDone == false) {
      foursDone = true;
      totalScore += (4 * fourCount);
      upperScore += (4 * fourCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (threeCount >= 3 && threesDone == false) {
      threesDone = true;
      totalScore += (3 * threeCount);
      upperScore += (3 * threeCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (twoCount >= 3 && twosDone == false) {
      twosDone = true;
      totalScore += (2 * twoCount);
      upperScore += (2 * twoCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (oneCount >= 3 && onesDone == false) {
      onesDone = true;
      totalScore += (1 * oneCount);
      upperScore += (1 * oneCount);
      if (checkBonus() == true) {
        totalScore += 35;
      }
    } else if (rollCount == 3) {
      if (chanceDone == false) {
        chanceDone = true;
        for (int x: roll) {
          totalScore += x;
        }
      }
      if (oneCount > 0 && onesDone == false) {
        onesDone = true;
        totalScore += (1 * oneCount);
        upperScore += (1 * oneCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }
      } else if (twoCount > 0 && twosDone == false) {
        twosDone = true;
        totalScore += (2 * twoCount);
        upperScore += (2 * twoCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }
      } else if (threeCount > 0 && threesDone == false) {
        threesDone = true;
        totalScore += (3 * threeCount);
        upperScore += (3 * threeCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }
      } else if (fourCount > 0 && foursDone == false) {
        foursDone = true;
        totalScore += (4 * fourCount);
        upperScore += (4 * fourCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }
      } else if (fiveCount > 0 && fivesDone == false) {
        fivesDone = true;
        totalScore += (5 * fiveCount);
        upperScore += (5 * fiveCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }
      } else if (sixCount > 0 && sixesDone == false) {
        sixesDone = true;
        totalScore += (6 * sixCount);
        upperScore += (6 * sixCount);
        if (checkBonus() == true) {
          totalScore += 35;
        }

      }

      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
      rollCount++;
    }
  }

  private boolean checkFullHouse() {
    boolean hasFullHouse = false;
    if (oneCount == 3) {
      if (twoCount == 2) {
        hasFullHouse = true;
      } else if (threeCount == 2) {
        hasFullHouse = true;
      } else if (fourCount == 2) {
        hasFullHouse = true;
      } else if (fiveCount == 2) {
        hasFullHouse = true;
      } else if (sixCount == 2) {
        hasFullHouse = true;
      }
    } else if (twoCount == 3) {
      if (oneCount == 2) {
        hasFullHouse = true;
      } else if (threeCount == 2) {
        hasFullHouse = true;
      } else if (fourCount == 2) {
        hasFullHouse = true;
      } else if (fiveCount == 2) {
        hasFullHouse = true;
      } else if (sixCount == 2) {
        hasFullHouse = true;
      }
    } else if (threeCount == 3) {
      if (twoCount == 2) {
        hasFullHouse = true;
      } else if (oneCount == 2) {
        hasFullHouse = true;
      } else if (fourCount == 2) {
        hasFullHouse = true;
      } else if (fiveCount == 2) {
        hasFullHouse = true;
      } else if (sixCount == 2) {
        hasFullHouse = true;
      }
    } else if (fourCount == 3) {
      if (twoCount == 2) {
        hasFullHouse = true;
      } else if (threeCount == 2) {
        hasFullHouse = true;
      } else if (oneCount == 2) {
        hasFullHouse = true;
      } else if (fiveCount == 2) {
        hasFullHouse = true;
      } else if (sixCount == 2) {
        hasFullHouse = true;
      }
    } else if (fiveCount == 3) {
      if (twoCount == 2) {
        hasFullHouse = true;
      } else if (threeCount == 2) {
        hasFullHouse = true;
      } else if (fourCount == 2) {
        hasFullHouse = true;
      } else if (oneCount == 2) {
        hasFullHouse = true;
      } else if (sixCount == 2) {
        hasFullHouse = true;
      }
    } else if (sixCount == 3) {
      if (twoCount == 2) {
        hasFullHouse = true;
      } else if (threeCount == 2) {
        hasFullHouse = true;
      } else if (fourCount == 2) {
        hasFullHouse = true;
      } else if (fiveCount == 2) {
        hasFullHouse = true;
      } else if (oneCount == 2) {
        hasFullHouse = true;
      }
    }
    return hasFullHouse;
  }

  public boolean checkWin() {
    boolean winner = true;
    for (boolean x: dones) {
      if (x == false) {
        winner = false;
        break;
      }
    }
    return winner;
  }

  private boolean checkBonus() {
    boolean[] upperDone = {
      onesDone,
      twosDone,
      threesDone,
      foursDone,
      fivesDone,
      sixesDone
    };
    boolean allDone = true;
    for (boolean x: upperDone) {
      if (x == false) {
        allDone = false;
        break;
      }
    }
    if (allDone == true && upperScore >= 63) {
      return true;
    } else {
      return false;
    }
  }

  public String getName() {
    return name;
  }

  public int getRollCount() {
    return rollCount;
  }

  public int getScore() {
    return totalScore;
  }

  public boolean[] getCompleted() {
    return dones;
  }

  public void setName(String newName) {
    name = newName;
  }

}