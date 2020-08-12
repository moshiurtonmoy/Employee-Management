/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.management;

/**
 *
 * @author andre
 */
public interface IEmployee {
    public void display();
    public double getSalary();
    public void increaseSalary(double amt) throws InvalidSalaryException;
}
