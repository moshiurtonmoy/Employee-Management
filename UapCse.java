package uaphr;
import java.util.ArrayList;
public class UapCse {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    String name;
    public UapCse(String name){
        this.name = name;
    }
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    public void addNewEmployee(String nm,String id,String des,double sal){
        Employee e = new Employee(nm,id,des,sal);
        addNewEmployee(e);
    }
    private Employee findEmployee(String id){
        for(Employee x : employees){
            if(x.getId().equals(id))
                return x;
        }
        System.out.println("Employee not found!");
        return null;
    }
   public void increaseSalary(String id,double amt){
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
       for(Employee x : employees){
           x.display();
       }
   }
}