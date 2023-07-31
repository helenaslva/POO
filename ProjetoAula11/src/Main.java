public class Main {
    public static void main(String[] args){
    //Person p1 = new Person() - classe abstrata não pode gerar objetos.

        Visitor v1 = new Visitor();
        v1.setName("Julia");
        v1.setAge(25);
        v1.setGender("F");
        System.out.println(v1.toString());

        Student s1 = new Student();
        s1.setName("Roger");
        s1.setRegistration(1111);
        s1.setCourse("IT");
        s1.setAge(23);
        s1.setGender("M");
        System.out.println();
        System.out.println(s1.toString());
        s1.payTuition();

        Scholar s2 = new Scholar();

        s2.setRegistration(1112);
        s2.setName("Gustavo");
        s2.setAge(21);
        s2.setScholarship(39);
        s2.setGender("M");
        s2.setCourse("IT");
        System.out.println();
        System.out.println(s2.toString());
        s2.payTuition();

        Teacher t1 = new Teacher();
        t1.setName("Sara");
        t1.setAge(52);
        t1.setGender("F");
        t1.setSalary(16000);
        t1.setSpecialty("Object-oriented programming (OOP)");
        System.out.println();
        System.out.println(t1.toString());
        System.out.println("Salary: $ " + t1.getSalary());
        t1.getRaise(3000);
        System.out.println("New salary: $ " + t1.getSalary());

        Technician t2 = new Technician();
        t2.setName("Liz");
        t2.setAge(29);
        t2.setGender("F");
        t2.setRegistration(1113);
        t2.setCourse("IT");
        t2.setProfessionalRecord("Internship at xll");
        System.out.println();
        System.out.println(t2.toString());
        System.out.println("Professional Record: "+t2.getProfessionalRecord());
        t2.toPractice();


    }
}