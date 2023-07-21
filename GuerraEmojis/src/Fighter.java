public class Fighter {

    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int defeats;
    private int ties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }
    private void setCategory() {
        if(getWeight()<52.2){
            this.category = "Invalid";
        }else if(getWeight()>=52.2 && getWeight()<61.2) {
            this.category = "Strawweight";
        }else if(getWeight()<=61.2){
            this.category = "Bantamweight";
        }else if(getWeight()<=70.3) {
            this.category = "Lightweight";
        }else if(getWeight()<=83.9) {
            this.category = "Middleweight";
        }else if(getWeight()<=120.2) {
            this.category = "Heavyweight";
        }else{
            this.category = "Invalid";
        }
    }

    public String getCategory() {
        return category;
    }
    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }
    public int getDefeats() {
        return defeats;
    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }



    public Fighter(String name, String nationality, int age, double height, double weight, int victories, int defeats, int ties) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.ties = ties;
    }

    public void introdution(){
        System.out.println("Lutador: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println(this.getAge() + " years old");
        System.out.println(this.getHeight() + "m");
        System.out.println(this.getWeight() + "kg");
        System.out.println(this.getVictories() + " victories");
        System.out.println(this.getDefeats() + " defeats");
        System.out.println(this.getTies() + " ties");

    }
    public void status(){
        System.out.println("Lutador: " + this.getName());
        System.out.println("Category: " + this.getCategory());
        System.out.println(this.getVictories() + " victories");
        System.out.println(this.getDefeats() + " defeats");
        System.out.println(this.getTies() + " ties");
        System.out.println("----------------------");

    }
    public void winFight(){
        this.setVictories(this.getVictories() + 1);
    }
    public void loseFight(){
        this.setDefeats(this.getDefeats() + 1);

    }
    public void tieFight(){
        this.setTies(this.getTies()+1);

    }

}
