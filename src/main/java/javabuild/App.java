/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javabuild;

import model.Employee;

public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            Employee.printEmpInfoByID(Integer.parseInt(args[0]));
        } else {
            System.out.println("No EmpID passed as argument!");
        }
    }
}
