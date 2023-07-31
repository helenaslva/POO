public class Teacher extends Person{
    private double salary;
    private String specialty;
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

    public void getRaise(double quant){
        this.setSalary(this.getSalary() + quant);

    }


}
