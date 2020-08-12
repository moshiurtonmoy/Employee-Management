package employee.management;


import java.util.ArrayList;
public class UapCse {
    public String name;
    ArrayList<Employee>employees  = new ArrayList<>();
    public UapCse(String name){
        this.name = name;
        System.out.println("*****Welcome to the dept. of CSE*****");
    }
    private void addNewEmployee(Employee e){
        employees.add(e);
        System.out.println("New employee has been employed!!");
    }
    public void addNewEmployee(String n,String i,String d,double s){
        Employee e = new Employee(n,i,d,s);
        addNewEmployee(e);
    }
    public void addNewEmployee(String n,String i,String d,double hr,int hw){
        Employee e = new Employee(n,i,d,hr,hw);
        addNewEmployee(e);
    }
    public void addNewEmployee(String n,String i,String d,double p,double s){
        Employee e = new Employee(n,i,d,p,s);
        addNewEmployee(e);
    }
    public Employee findEmployee(String id){
        for(Employee x : employees){
            if(x.getId().equals(id))
                return x;
        }
        System.out.println("Employee not found!");
        return null;
    }
    public void increaseSalary(String id,double amt) throws InvalidSalaryException{
        Employee x = findEmployee(id);
        if(x!=null){
            x.increaseSalary(amt);
        }
        else
            System.out.println("Employee not found!");
    }
    public double getSalary(String id){
        Employee x = findEmployee(id);
        if(x!=null){
            return x.getSalary();
        }
        System.out.println("Employee not found!");
        return -1;
    }
    public void display(String id){
        Employee x = findEmployee(id);
        if(x!=null){
            x.display();
        }
    }
    public void display(){
        employees.forEach((x) -> {
            x.display();
        });
    }
}
