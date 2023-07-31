public class Main {
    public static void main(String[] args) {
       Person p1 = new Person();
       Student s1 = new Student();
       Teacher t1 = new Teacher();
       Employee e1 = new Employee();

       p1.setName("Helena");
       s1.setName("Luana");
       t1.setName("Ana");
       e1.setName("João");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(t1.toString());
        System.out.println(e1.toString());

       s1.setCourse("IT");
       t1.setSalary(3000);
       e1.setSector("stock");

       t1.getRaise(1566);

    }
}