package employee.management;


public class HourlyEmployee implements IEmployee{
    private String name,id,designation;
    private double hourlyRate;
    private int hourlyWorked;
    public HourlyEmployee(String name,String id,String designation,double hourlyRate,int hourlyWorked){
        this.name = name; this.id = id; this.designation = designation; this.hourlyRate = hourlyRate ;this.hourlyWorked = hourlyWorked;
    }
    /*public double getSalary(int hourlyWorked){
        return hourlyRate*hourlyWorked;
    }
    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException{
        if(hourlyRate+amt>500)
            throw new InvalidSalaryException("Hourly rate can’t be more than 500");
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
    }*/

    @Override
    public void display() {
        System.out.println("Rate: "+hourlyRate);
    }

    @Override
    public double getSalary() {
        return hourlyRate*hourlyWorked;
    }

    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException {
        if(hourlyRate+amt>500)
            throw new InvalidSalaryException("Hourly rate can’t be more than 500");
        hourlyRate += amt;
    }
    
}
