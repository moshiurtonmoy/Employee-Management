package uap.hr;
public class CommissionEmployee extends Employee{
    public double commission,sale;
    public CommissionEmployee(String name,String id,String designation,double commission,double sale){
        super(name,id,designation);
        this.commission = commission;
        this.sale = sale;
    }
    public double getSalary(double _sale){
        return commission*_sale;
    }
    @Override
    public void increaseSalary(double amt){
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
    }
}
