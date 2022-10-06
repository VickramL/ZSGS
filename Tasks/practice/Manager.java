package practise;

public class Manager extends Employee {

    int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    Manager(String name, String role, int salary)
    {
        super(name, role, salary);
    }
    public int getSalary(){
        return super.getSalary() + bonus;
    }
    public void getInfo(){
        System.out.println("Name : "+getName()+"\nRole : "+getRole()+"\nSalary : "+getSalary());
    }
}
