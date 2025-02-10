import java.util.*;

class EMPLOYEES {
    String name;
    int id;
    double basic, DA, netSalary, grossSalary;

    EMPLOYEES(String name, int id, double basic) {
        this.name = name;
        this.id = id;
        this.basic = basic;
    }

    void calculateSalary() {
        DA = 0.52 * basic;
        grossSalary = basic + DA;
        double IT = 0.3 * grossSalary;
        netSalary = grossSalary - (DA + IT);
    }

    void displayEmployeeDetails() {
        System.out.println(name + "\t" + id + "\t" + basic + "\t" + DA + "\t" + netSalary);
    }
}

class FullTimeEmp extends EMPLOYEES {
    double bonus, deductions;

    FullTimeEmp(String name, int id, double basic, double bonus, double deductions) {
        super(name, id, basic);
        this.bonus = bonus;
        this.deductions = deductions;
    }

    void calculateSalary() {
        super.calculateSalary();
        netSalary += bonus - deductions;
    }

    void displayEmployeeDetails() {
        System.out.println(name + "\t" + id + "\t" + basic + "\t" + DA + "\t" + netSalary + "\tBonus: " + bonus + "\tDeductions: " + deductions);
    }
}

class PartTimeEmp extends EMPLOYEES {
    int hoursWorked;
    static final double hourlyRate = 50;

    PartTimeEmp(String name, int id, double basic, int hoursWorked) {
        super(name, id, basic);
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        netSalary = hoursWorked * hourlyRate;
    }

    void displayEmployeeDetails() {
        System.out.println(name + "\t" + id + "\t" + basic + "\tHourly Rate: " + hourlyRate + "\tHours Worked: " + hoursWorked + "\tNet Salary: " + netSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmp fte = new FullTimeEmp("Parv", 1, 50000, 5000, 1000);
        PartTimeEmp pte = new PartTimeEmp("Pranit", 2, 0, 20);

        fte.calculateSalary();
        pte.calculateSalary();

        fte.displayEmployeeDetails();
        pte.displayEmployeeDetails();
    }
}
