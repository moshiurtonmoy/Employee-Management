public abstract class Employee implements Display{
    //atributos
    private String name;
    private String id;
    private String designation;
    //constructor parametro
    public Employee(String name,String id,String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public String getId(){
        return id;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }


    @Override
    public void display(){
        System.out.print("Name: "+name+"; Id: "+id+"; Designation: "+designation+" ");
    }
  
    public abstract double getSalary();
    public abstract void increaseSalary(double amt) throws InvalidSalaryException;
    
}