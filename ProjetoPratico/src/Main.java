public class Main {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        Books[] b = new Books[3];

        p[0] = new Person("Helena", 20, "Female");
        p[1] = new Person("Luana", 20, "Female");


        b[0] = new Books("The Whispers", "Ashley Audrain", 336, p[0] );
        b[1] = new Books("All the Gold Stars", "Rainesford Stauffer", 288, p[1] );
        b[2] = new Books("Banyan Moon", "Thao Thai", 336, p[0]);

        b[0].leafThrough(337);
        System.out.println(b[0].details());
        b[0].nextPage();


    }
}