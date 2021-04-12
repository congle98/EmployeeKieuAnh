package Employee;

public class PartTimeEmployee extends Employee{
    private double workingTime;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name, int age, int phoneNumber, String email,double workingTime) {
        super(id, name, age, phoneNumber, email);
        this.workingTime=workingTime;
    }

    public PartTimeEmployee(double workingTime) {
        this.workingTime = workingTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }
    public double getSalary(){
        return workingTime*100000;
    };

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workingTime=" + workingTime + super.toString()+
                '}';
    }
}
