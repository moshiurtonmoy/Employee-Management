package employee.management;


public class SalariedEmployee implements IEmployee {
    private String name,id,designation;
    public double monthlySalary;
    public SalariedEmployee(String name,String id,String designation,Double monthlySalary){
        this.name = name; this.id = id; this.designation = designation; this.monthlySalary = monthlySalary;
    }
    /*@Override
    public double getSalary(){
        return monthlySalary;
    }
    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException{
        if(amt<=0)
            throw new InvalidSalaryException("Increase amount should be a positive number.");
        monthlySalary += amt;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Salary: "+monthlySalary);
    }*/

    @Override
    public void display() {
        System.out.println("Salary: "+monthlySalary);
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException {
        if(amt<=0)
            throw new InvalidSalaryException("Increase amount should be a positive number.");
        monthlySalary += amt;
    }
    
}
