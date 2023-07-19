public class Main {
    public static void main(String[] args) {

        Canetas c1 = new Canetas("Bic Crital", "Azul", 0.5f);
        c1.setCarga(70);
         c1.status();

         Canetas c2 = new Canetas("Stabilo", "Rosa", 0.4f);
         c2.setCarga(95);

         c2.status();


    }
}