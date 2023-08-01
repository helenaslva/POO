public class Bird extends Animal{
    private String feathersColor;
    public String getFeathersColor() {
        return feathersColor;
    }

    public void setFeathersColor(String feathersColor) {
        this.feathersColor = feathersColor;
    }

    public void toNest(){
        System.out.println("Nesting");
    }


    @Override
    void moveAround() {
        System.out.println("Flying");
    }

    @Override
    void feed() {
        System.out.println("Eating birds food");

    }

    @Override
    void makeSound() {
        System.out.println("Making some bird noises");

    }
}
