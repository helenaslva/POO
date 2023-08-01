public class Main {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();

        m.setWeight(35.5);
        m.setFurColor("Black");
        m.setAge(2);
        m.setMembers(4);
        m.feed();
        m.moveAround();
        m.makeSound();
        System.out.println();

        r.setWeight(12);
        r.setScalesColor("Green");
        r.setAge(1);
        r.setMembers(4);
        r.makeSound();
        r.moveAround();
        System.out.println();

        b.setAge(5);
        b.setMembers(2);
        b.setFeathersColor("White");
        b.setWeight(3);
        b.makeSound();
        b.moveAround();
        b.toNest();
        System.out.println();

        Kangaroo k = new Kangaroo();
        k.moveAround();
        k.usePouch();
        System.out.println();

        Dog d = new Dog();
        d.makeSound();
    }
}