package employee.management;

public class CommissionEmployee implements IEmployee{
    private double commission,sale;
    private String name,id,designation;
    public CommissionEmployee(String name,String id,String designation,double commission,double sale){
        this.name = name; this.id = id; this.designation = designation; this.commission = commission; this.sale = sale;
    }
    /*public double getSalary(double _sale){
        return commission*_sale;
    }
    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException{
        if(commission+amt>.30)
            throw new InvalidSalaryException("Commission cannot be more than 30%");
        commission += amt;
    }
    @Override
    public double getSalary(){
        return commission*sale;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Commission: "+commission);
    }*/
    
    @Override
    public void display() {
        System.out.println("Commission: "+commission);
        }

    @Override
    public double getSalary() {
        return commission*sale;
    }

    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException {
        if(commission+amt>.30)
            throw new InvalidSalaryException("Commission cannot be more than 30%");
        commission += amt;
    }
    
    
}