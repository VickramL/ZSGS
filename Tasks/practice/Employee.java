package practise;

public class Employee {
    private String name;
    private String role;
    private int salary;

    Employee(String name,String role, int salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(double percent) {
        salary += salary*percent/100;
    }

     public void getInfo(){
         System.out.println("Name : "+name+"\nRole : "+role+"\nSalary : "+salary);
     }
}
