
public interface IOperacionesE extends Display{
    public abstract void addNewEmployee(Employee e);
    public abstract Employee findEmployee(String id);
    public abstract void increaseSalary(String id,double amt) throws InvalidSalaryException;
    public abstract void display(String id);
    public abstract double getSalary(String id);
}