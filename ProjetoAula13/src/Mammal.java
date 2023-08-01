public class Mammal extends Animal{
    protected String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    @Override
    public void makeSound() {
        System.out.println("Making some mammal sound");
    }
}
