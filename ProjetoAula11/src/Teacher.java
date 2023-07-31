public class Teacher extends Person{

    private String specialty;
    private double salary;
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getRaise(int quant){
        this.setSalary(this.getSalary() + quant);
        System.out.println("got Raised");
    }



}
