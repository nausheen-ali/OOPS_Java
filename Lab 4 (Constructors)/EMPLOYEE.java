class EMPLOYEE {
    String name;
    int id;
    double basic;
    double grossSal;
    double netSal;

    EMPLOYEE() {
        this.name = "Unknown";
        this.id = 0;
        this.basic = 0.0;
        this.grossSal = 0.0;
        this.netSal = 0.0;
    }

    EMPLOYEE(String name, int id, double basic) {
        this.name = name;
        this.id = id;
        this.basic = basic;
	compute();
    }

    public void compute(){
        grossSal=basic + (0.52 * basic);
        netSal = grossSal - (0.15 * grossSal);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Gross Salary: " + grossSal);
        System.out.println("Net Salary: " + netSal);
    }

    public static void main(String[] args) {
        EMPLOYEE emp1 = new EMPLOYEE();
        emp1.display();

        EMPLOYEE emp2 = new EMPLOYEE("Alfredo", 1018, 50000.0);
        emp2.display();
    }
}
