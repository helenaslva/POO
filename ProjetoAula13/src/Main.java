public class Main {
    public static void main(String[] args) {
        Mammal x = new Mammal();
        Wolf w = new Wolf();
        Dog d = new Dog();


        x.setName("Rogerinho");
        x.setFurColor("White");
        x.setMembers(4);
        x.setWeight(34.5);
        x.setAge(1);
        System.out.println(x.toString());
        x.makeSound();
        System.out.println();

        d.react("Come here!");
        d.react("Shut up!");
        d.react(11);
        d.react(21);
        d.react(true);
        d.react(3, 23);

    }
}