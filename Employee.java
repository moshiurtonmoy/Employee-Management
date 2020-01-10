package uaphr;
public class Employee {
    private String name,id,designation;
    private double salary;
    public Employee(String name,String id,String designation,double salary){
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    public void increaseSalary(double amt){
        salary += amt;
    }
    public void setName(String name){
        this.name = name;
    }
     public void setId(String id){
        this.id = id;
    }
     public void setDesignation(String designation){
        this.designation = designation;
    }
     public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public String getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Name: "+name+"; Id: "+id+"; Designation: "+designation+"; Salary: "+salary+";");
    }
}
