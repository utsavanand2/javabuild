package model;

import java.util.*;

public class Employee {
    private int empNumber;
    private String empName;
    private String joinDate;
    private String designationCode;
    private String department;
    private int basic;
    private int hra;
    private int it;

    public Employee() {}

    private Employee(
        int empNumber,
        String empName,
        String joinDate,
        String designationCode,
        String department,
        int basic,
        int hra,
        int it
    ) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public static List<Employee> initWithDefaultData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000));
        employees.add(new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000));
        employees.add(new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000));
        employees.add(new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000));
        employees.add(new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000));
        employees.add(new Employee(1006, "Suman", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400));
        employees.add(new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000));

        return employees;
    }

    private static Employee getEmpByNumber(int empNumer) {
        List<Employee> employees = initWithDefaultData();
        for(Employee emp : employees) {
            if (empNumer == emp.empNumber) {
                return emp;
            }
        }
        return null;
    }

    public static void printEmpInfoByID(int empNumber) {
        Employee emp = getEmpByNumber(empNumber);
        DearnessAllowance da = new DearnessAllowance();
        if (emp != null) {
            da = DearnessAllowance.getDaByCode(emp.designationCode);

            if (da == null) {
                System.out.println("Instance of DearnessAllowance is null");
                return;
            }
            
            int salary = emp.basic + emp.hra + da.getDA() - emp.it;
            System.out.format(
                "%-20s%-20s%-20s%-20s%-20s\n",
                "Emp No.",
                "Emp Name",
                "Department",
                "Designation",
                "Salary"
            );

            System.out.format(
                "%-20d%-20s%-20s%-20s%-20d\n",
                emp.empNumber,
                emp.empName,
                emp.department,
                da.getDesg(),
                salary
            );

        } else {
            System.out.println("There is no employee with empid: " + Integer.toString(empNumber));
        }
    }

}