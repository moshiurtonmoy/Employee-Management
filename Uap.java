package uaphr;
import java.util.Scanner;
public class Uap {
    public static void main(String[] args) {
        UapCse myUap = new UapCse("CSE");
        Scanner scan = new Scanner(System.in);
        UI choice = new UI();
        choice.option();
        while(true){
            int op = scan.nextInt();
            if(op==1){
                System.out.println("Enter new Employee's Name,Id,Designation & Salary respectively: ");
                scan.nextLine();
                String n = scan.nextLine();
                String i = scan.nextLine();
                String d = scan.nextLine();
                double s = scan.nextDouble();
                myUap.addNewEmployee(n, i, d, s);
                choice.option();
            }
            else if(op==2){
                System.out.println("Enter employee's ID: ");
                String i = scan.next();
                myUap.getSalary(i);
                choice.option();
            }
            else if(op==3){
                System.out.println("Enter employee's ID & the amount need to be raised: ");
                String i = scan.next();
                double d = scan.nextDouble();
                myUap.increaseSalary(i, d);
                choice.option();
            }
            else if(op==4){
                System.out.println("Enter employee's ID: ");
                String i = scan.next();
                myUap.display(i);
                choice.option();
            }
            else if(op==5){
                myUap.display();
                choice.option();
            }
            else if(op==0)
                break;
        }
    }
}
