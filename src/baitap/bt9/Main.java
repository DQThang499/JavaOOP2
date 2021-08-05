package baitap.bt9;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee(1,"Dương","Thắng",10000000);
        System.out.println(employee.Lastname());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.toString());
        System.out.println("salary up to: "+employee.upToSalary(10));
    }
}
