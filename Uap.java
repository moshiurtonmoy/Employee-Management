package uap.hr;
import java.util.Scanner;
public class UAP {
    public static void main(String[] args) {
        UapCse myUap = new UapCse("CSE");
        Scanner scan = new Scanner(System.in);
        UI choice = new UI();
        while(true){
            choice.option();
            int op = scan.nextInt();
            if(op==1){
                while(true){
                    choice.subEmployeeOption();
                    int subOp = scan.nextInt();
                    if(subOp==1){
                        System.out.println("Enter new Employee's Name,Id,Designation & Salary respectively: ");
                        scan.nextLine();
                        String n = scan.nextLine();
                        String i = scan.nextLine();
                        String d = scan.nextLine();
                        double s = scan.nextDouble();
                        myUap.addNewEmployee(n,i,d,s);
                        break;
                    }
                    else if(subOp==2){
                        System.out.println("Enter new Employee's Name,Id,Designation,Hourly Rate & Hourly Work respectively: ");
                        scan.nextLine();
                        String n = scan.nextLine();
                        String i = scan.nextLine();
                        String d = scan.nextLine();
                        double hr = scan.nextDouble();
                        int hw = scan.nextInt();
                        myUap.addNewEmployee(n,i,d,hr,hw);
                        break;
                    }
                    else if(subOp==3){
                        System.out.println("Enter new Employee's Name,Id,Designation,Commission & Sale respectively: ");
                        scan.nextLine();
                        String n = scan.nextLine();
                        String i = scan.nextLine();
                        String d = scan.nextLine();
                        double c = scan.nextDouble();
                        double s = scan.nextDouble();
                        myUap.addNewEmployee(n,i,d,c,s);
                        break;
                    }
                    else
                        System.out.println("Wrong key pressed! Please try again.");
                }
            }
            else if(op==2){
                System.out.println("Enter employee's ID: ");
                String i = scan.next();
                double s = myUap.getSalary(i);
                if(s!=-1)
                    System.out.println(s);
            }
            else if(op==3){
                System.out.println("Enter employee's ID & the amount need to be raised: ");
                String i = scan.next();
                double d = scan.nextDouble();
                myUap.increaseSalary(i, d);
            }
            else if(op==4){
                System.out.println("Enter employee's ID: ");
                String i = scan.next();
                myUap.display(i);
            }
            else if(op==5){
                myUap.display();
            }
            else if(op==0){
                break;
            }
            else 
                System.out.println("Wrong key pressed! Please try again.");
        }
    }
}
