import java.util.ArrayList;

public class OperacionesEmployee implements IOperacionesE{
    
    ArrayList<Employee>employees  = new ArrayList<>();

    public OperacionesEmployee() {
    }
     
    @Override
    public void addNewEmployee(Employee e){
        employees.add(e);
        System.out.println("New employee has been employed!!");
    }
    
    @Override
    public Employee findEmployee(String id){
        for(Employee x : employees){
            if(x.getId().equals(id))
                return x;
        }
        System.out.println("Employee not found!");
        return null;
    } 
    
    @Override
    public void increaseSalary(String id,double amt) throws InvalidSalaryException{
        Employee x = findEmployee(id);
        if(x!=null){
            x.increaseSalary(amt);   
        }
        else
            System.out.println("Employee not found!");
    }
    
    @Override
    public double getSalary(String id){
        Employee x = findEmployee(id);
        if(x!=null){
            return x.getSalary();
        }
        System.out.println("Employee not found!");
        return -1;
    }
    
    @Override
    public void display(String id){
        Employee x = findEmployee(id);
        if(x!=null){
            x.display();
        }
    }  

    @Override
    public void display(){
        for(Employee x : employees){
            x   .display();
        }
    }  
}