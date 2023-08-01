public class Reptile extends Animal{
    private String scalesColor;

    public String getScalesColor() {
        return scalesColor;
    }

    public void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }


    @Override
    void moveAround() {
        System.out.println("Crawling");
    }

    @Override
    void feed() {
        System.out.println("Eating vegetables and stuff that reptiles eat");

    }

    @Override
    void makeSound() {
        System.out.println("Making reptiles sound");

    }
}
