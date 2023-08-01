public class Fish extends Animal{
    private String scalesColor;
    public String getScalesColor() {
        return scalesColor;
    }

    public void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }




    public void toBubble(){
        System.out.println("Bubbling");
    }

    @Override
    void moveAround() {
        System.out.println("Swimming");
    }

    @Override
    void feed() {
        System.out.println("Eating stuff that fish eats");

    }

    @Override
    void makeSound() {
        System.out.println("Fish doesn't make any sound.");

    }
}
