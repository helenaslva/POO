public abstract class Animal {
    protected double weight;
    protected int age;
    protected int members;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
    abstract void moveAround();

    abstract void feed();
    abstract void makeSound();





}
