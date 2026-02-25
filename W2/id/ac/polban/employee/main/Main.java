package id.ac.polban.employee.main;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {
        
        Department itDept = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        
        Employee emp1 = new Employee(1, "Budi", itDept, fullTime, 5000000);
        Employee emp2 = new Employee(2, "Siti", itDept, fullTime, 5500000);

        
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        
        System.out.println("Total Employees saat ini: " + Employee.getTotalEmployees());
        
        System.out.println("\n--- Data Gaji Awal ---");
        System.out.println("Gaji Budi: Rp " + service.getEmployee(1).getSalary());
        
        
        service.raiseSalary(1, 10);
        
        System.out.println("\n--- Setelah Kenaikan Gaji 10% ---");
        System.out.println("Gaji Budi sekarang: Rp " + service.getEmployee(1).getSalary());
    }
}