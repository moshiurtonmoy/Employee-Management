package employee.management;

public class Employee {
    private IEmployee employee;
    private String name,id,designation;
    private double hourlyRate,commission,sale,monthlySalary;
    private int hourlyWorked;

    //SalariedEmployee
    public Employee(String name,String id,String designation,Double monthlySalary){
        this.name = name; this.id = id; this.designation = designation; this.monthlySalary = monthlySalary;
	this.hourlyRate = 0; this.commission = 0; this.sale = 0; this.hourlyWorked = 0;
	}

    //CommissionEmployee
    public Employee(String name,String id,String designation,double commission,double sale){
	this.name = name; this.id = id; this.designation = designation; this.commission = commission; this.sale = sale;
	this.hourlyRate = 0; this.monthlySalary = 0; this.hourlyWorked = 0;
	}

    //HourlyEmployee
    public Employee(String name,String id,String designation,double hourlyRate,int hourlyWorked){
	this.name = name; this.id = id; this.designation = designation; this.hourlyRate = hourlyRate ;this.hourlyWorked = hourlyWorked;
	this.commission = 0; this.monthlySalary = 0; this.sale = 0;
	}
    
    public void display(){
        System.out.print("Name: "+name+"; Id: "+id+"; Designation: "+designation+" ");
        employee.display();
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public double getSalary(){
        return employee.getSalary();
    }
    public void increaseSalary(double amt) throws InvalidSalaryException{
        employee.increaseSalary(amt);
    }
    
    public void typeEmployee(){
        if(isSalariedEmployee()){
            employee = new SalariedEmployee(name,id,designation,monthlySalary);
        }
        else if(isCommissionEmployee()){
            employee = new CommissionEmployee(name,id,designation,commission, sale);
        }
        else if(isHourlyEmployee()){
            employee = new HourlyEmployee(name,id,designation,hourlyRate,hourlyWorked);
        }
    }
    
    private boolean isSalariedEmployee(){
        return name.equals("") && id.equals("") && designation.equals("") && monthlySalary!=0;
    }
    
    private boolean isCommissionEmployee(){
        return name.equals("") && id.equals("") && designation.equals("") && commission!=0 && sale!=0;
    }
    
    private boolean isHourlyEmployee(){
        return name.equals("") && id.equals("") && designation.equals("") && hourlyRate!=0 && hourlyWorked!=0;
    }
    
/*public abstract class Employee {
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
    public abstract void increaseSalary(double amt) throws InvalidSalaryException;*/

    

    
}