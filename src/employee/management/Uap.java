package employee.management;


import java.util.Scanner;
import javax.swing.JOptionPane;
public class Uap {
    public static void main(String[] args) {
        UapCse myUap = new UapCse("CSE");
        Scanner scan = new Scanner(System.in);
        UI choice = new UI();
        OUTER:
        while (true) {
            choice.option();
            int op = scan.nextInt();
            switch (op) {
                case 1:
            OUTER_1:
            while (true) {
                choice.subEmployeeOption();
                int subOp = scan.nextInt();
                switch (subOp) {
                    case 1:
                        {
                            System.out.println("Enter new Employee's Name,Id,Designation & Salary respectively: ");
                            scan.nextLine();
                            String n = scan.nextLine();
                            String i = scan.nextLine();
                            String d = scan.nextLine();
                            double s = scan.nextDouble();
                            myUap.addNewEmployee(n,i,d,s);
                            break OUTER_1;
                        }
                    case 2:
                        {
                            System.out.println("Enter new Employee's Name,Id,Designation,Hourly Rate & Hourly Work respectively: ");
                            scan.nextLine();
                            String n = scan.nextLine();
                            String i = scan.nextLine();
                            String d = scan.nextLine();
                            double hr = scan.nextDouble();
                            int hw = scan.nextInt();
                            myUap.addNewEmployee(n,i,d,hr,hw);
                            break OUTER_1;
                        }
                    case 3:
                        {
                            System.out.println("Enter new Employee's Name,Id,Designation,Commission & Sale respectively: ");
                            scan.nextLine();
                            String n = scan.nextLine();
                            String i = scan.nextLine();
                            String d = scan.nextLine();
                            double c = scan.nextDouble();
                            double s = scan.nextDouble();
                            myUap.addNewEmployee(n,i,d,c,s);
                            break OUTER_1;
                        }
                    default:
                        System.out.println("Wrong key pressed! Please try again.");
                        break;
                }
            }
            break;
                case 2:
                    {
                        System.out.println("Enter employee's ID: ");
                        String i = scan.next();
                        double s = myUap.getSalary(i);
                        if(s!=-1)
                            System.out.println(s);
                        break;
                    }
                case 3:
                    {
                        System.out.println("Enter employee's ID & the amount need to be raised: ");
                        String i = scan.next();
                        double d = scan.nextDouble();
                        try{
                            myUap.increaseSalary(i, d);
                        }
                        catch(InvalidSalaryException e){
                            JOptionPane.showMessageDialog(null,e.getMessage());
//                    System.out.println(e.getMessage());
//                    e.printStackTrace();
                        }       break;
                    }
                case 4:
                    {
                        System.out.println("Enter employee's ID: ");
                        String i = scan.next();
                        myUap.display(i);
                        break;
                    }
                case 5:
                    myUap.display();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Wrong key pressed! Please try again.");
                    break;
            }
        }
    }
}
