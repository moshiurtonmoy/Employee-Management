package uap.hr;
public class SalariedEmployee extends Employee {
    public double monthlySalary;
    public SalariedEmployee(String name,String id,String designation,Double monthlySalary){
        super(name,id,designation);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double getSalary(){
        return monthlySalary;
    }

    /**
     *
     * @param amt
     * @throws InvalidSalaryException
     */
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
    }
}
