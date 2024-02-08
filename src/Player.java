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

  public Player(String name) {
    this.name = name;
    for (int i = 0; i < saved.length; i++) {
      saved[i] = false;
    }
  }

  public int[] roll() {
    for (int i = 0; i < roll.length; i++) {
      if (saved[i] == false) {
        roll[i] = (int)(Math.random() * 6 + 1);
        System.out.println(roll[i]);
      }
    }
    return roll;
  }

  public String getName() {
    return name;
  }

  public void setSave(int index, boolean tof) {
    saved[index] = tof;
  }

  public boolean getSave(int index) {
    return saved[index];
  }

  public boolean checkWin() {
    boolean won = true;
    for (boolean x: dones) {
      if (x == false) {
        won = false;
        break;
      }
    }
    return won;
  }

}