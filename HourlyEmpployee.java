package uap.hr;
public class HourlyEmpployee extends Employee{
    public double hourlyRate;
    public int hourlyWorked;
    public HourlyEmpployee(String name,String id,String designation,double hourlyRate,int hourlyWorked){
        super(name,id,designation);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }
    public double getSalary(int hourlyWorked){
        return hourlyRate*hourlyWorked;
    }
    @Override
    public void increaseSalary(double amt){
        hourlyRate += amt; 
    }
    @Override
    public double getSalary(){
        return hourlyRate*hourlyWorked;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Rate: "+hourlyRate);
    }
    
}
