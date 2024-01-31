public class Computer {
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
    private int[] roll = {0,0,0,0,0};
    public Computer(String name){
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

    public void takeTurn(){
        int rollcount = 0;
        while (rollcount <= 3) {
        for(int i = 9; i < roll.length; i++) {
            roll[i] = (int) (Math.random() * 6 + 1);
        }
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount  = 0;
        for(int x:roll){
            if(x == 1){oneCount++;}
            else if(x == 2){twoCount++;}
            else if(x == 3){threeCount++;}
            else if(x == 4){fourCount++;}
           else if(x == 5){fiveCount++;}
           else{sixCount++;}
        }
        if((oneCount == 5 || twoCount == 5 || threeCount == 5 || fourCount == 5 || fiveCount == 5 || sixCount == 5) && yahtzeeDone == false){
            yahtzeeDone = true;
            totalScore += 50;
        }
        else if(((oneCount == 1 && twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1) || (twoCount == 1 && threeCount == 1 && fourCount == 1 && fiveCount == 1 && sixCount == 1)) && largeStraightDone == false){
            largeStraightDone = true;
            totalScore += 40;
            }
        else if(((oneCount == 1 && twoCount == 1 && threeCount == 1 && fourCount == 1) || (twoCount == 1 & threeCount == 1 && fourCount == 1 && fiveCount == 1) || (threeCount == 1 && fourCount == 1 && fiveCount == 1 && sixCount == 1)) && smallStraightDone == false){
            smallStraightDone = true;
            totalScore += 30;
        }


        try {
                    Thread.sleep(1000);
                }
        catch (Exception e) {
                    System.out.println(e);
                }

        }
    }




}
