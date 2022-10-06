package practise;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Karthik","HR",40000);
        employee.getInfo();
        Manager manager = new Manager("Hari Prasath","Manager",80000);
        manager.setBonus(10000);
        System.out.println();
        manager.getInfo();
    }
}
