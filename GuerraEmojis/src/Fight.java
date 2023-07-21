import java.util.Random;

public class Fight {


    private Fighter challenged;
    private Fighter challenger;
    private int round;
    private boolean approved;


    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    public void markFight(Fighter f1, Fighter f2) {
        if ((f1.getCategory() == f2.getCategory()) && (f1 != f2)) {
            this.setApproved(true);
            this.setChallenged(f1);
            this.setChallenger(f2);
            System.out.println("Can happen!");
        } else {
            this.setApproved(false);
            this.setChallenger(null);
            this.setChallenged(null);
            System.out.println("Can't happen!");
        }

    }

    public void fight() {
        if (this.isApproved()) {
            System.out.println("####### CHALLENGED ######");
            this.getChallenged().status();
            System.out.println();
            System.out.println("####### CHALLENGER ######");
            this.getChallenger().status();
            Random r = new Random();
            int winner = r.nextInt(3);
            System.out.println();

            switch (winner) {
                case 0:
                    System.out.println("Tie!");
                    this.getChallenger().tieFight();
                    this.getChallenged().tieFight();
                    break;
                case 1:
                    System.out.println(this.getChallenged().getName() + " wins!");
                    this.getChallenged().winFight();
                    this.getChallenger().loseFight();
                    break;
                case 2:
                    System.out.println(this.getChallenger().getName() + " wins!");
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                    break;
            }
            System.out.println("----------------------");


        } else {
            System.out.println("Fight couldn't happen");
        }

    }
}

