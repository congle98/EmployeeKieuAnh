package Employee;

public class FullTimeEmployee extends Employee{
    double reward;
    double punish;
    double salaryBasic;

    public FullTimeEmployee(double reward, double punish, double salaryBasic) {
        this.reward = reward;
        this.punish = punish;
        this.salaryBasic =salaryBasic;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name, int age, int phoneNumber, String email, double reward, double punish, double salaryBasic) {
        super(id, name, age, phoneNumber, email);
        this.reward = reward;
        this.punish = punish;
        this.salaryBasic=salaryBasic;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getPunish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }

    public double getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(double salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public double getSalary(){
        return salaryBasic+reward-punish;
    };

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "reward=" + reward +
                ", punish=" + punish +
                ", salaryBasic=" + salaryBasic + super.toString()+
                '}';
    }
}
