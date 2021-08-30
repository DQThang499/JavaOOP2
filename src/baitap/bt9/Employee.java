package baitap.bt9;

public class Employee {
    private int id;
    private String Firstname;
    private String Lastname;
    private int salary;
    private String chucvu;
    public Employee(int id, String Firstname, String Lastname, int salary, String chucvu){
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.salary = salary;
        this.chucvu = chucvu;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String Firstname(){
        return Firstname;
    }
    public void setFirstname(String Firstname){
        this.Firstname = Firstname;
    }
    public String Lastname(){
        return Lastname;
    }
    public void setLastname(String Lastname){
        this.Lastname = Lastname;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    public int upToSalary(int percent){
        return this.salary+(this.salary * percent)/100;
    }
    public String toString(){
        return this.Firstname() + " - " + "salary: "+ this.salary;
    }
}
