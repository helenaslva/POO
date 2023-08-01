public class Mammal extends Animal {
    private String furColor;
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    @Override
    void moveAround() {
        System.out.println("Running");
    }

    @Override
    void feed() {
        System.out.println("Suckling");

    }

    @Override
    void makeSound() {
        System.out.println("Making mammal sound");

    }
}
