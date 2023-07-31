import java.util.SortedMap;

public class Scholar extends Student{
    private int scholarship;
    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
    public void renewScholarship(){
        System.out.println("Renewing " + this.getName() + "'s scholarship...");
    }

    @Override
    public void payTuition(){
        System.out.println(this.getName() + " is an Scholar. Easier payment");

    }




}
