// Jangan lupa import package yang sudah Anda buat!
import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main { // Ubah jadi 'class Main' jika nama file Anda Main.java
    public static void main(String[] args) {
        // 1. Membuat object Department dan EmploymentType
        Department itDept = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        // 2. Membuat object Employee
        Employee emp1 = new Employee(1, "Budi", itDept, fullTime, 5000000);
        Employee emp2 = new Employee(2, "Siti", itDept, fullTime, 5500000);

        // 3. Memasukkan data ke dalam Service
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        // 4. Menampilkan hasil dan menguji Static Method
        System.out.println("Total Employees saat ini: " + Employee.getTotalEmployees());
        
        System.out.println("\n--- Data Gaji Awal ---");
        System.out.println("Gaji Budi: Rp " + service.getEmployee(1).getSalary());
        
        // 5. Menguji kenaikan gaji
        service.raiseSalary(1, 10); // Gaji Budi naik 10%
        
        System.out.println("\n--- Setelah Kenaikan Gaji 10% ---");
        System.out.println("Gaji Budi sekarang: Rp " + service.getEmployee(1).getSalary());
    }
}