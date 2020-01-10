package uap.hr;
public abstract class Employee {
    private String name,id,designation;
    public Employee(String name,String id,String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    public void display(){
        System.out.print("Name: "+name+"; Id: "+id+"; Designation: "+designation+" ");
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
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public String getId(){
        return id;
    }
    public abstract double getSalary();
    public abstract void increaseSalary(double amt);
}