public abstract class Animal {


    protected String name;
    protected double weight;
    protected int age;
    protected int members;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal {" +
                ", name=" + name +
                ", weight=" + weight +
                ", age=" + age +
                ", members=" + members +

                '}';
    }
}
