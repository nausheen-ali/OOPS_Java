class BankAccount {
    String name;
    long accNo;
    String accType;
    double bal;
    static double rate; 

    public BankAccount() {
        this.name = "Unknown";
        this.accNo= 0;
        this.accType = "Unknown";
        this.bal = 0.0;
	this.rate = 3.5;
    }

    public BankAccount(String name, long accNo, String accType, double bal, double rate) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.bal = bal;
	this.rate = rate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        double min_bal = 1000;
        if (amount > 0 && bal - amount >= min_bal) { 
            bal -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else if (amount<=0){
            System.out.println("Invalid Withdrawal amount");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println(name+"\t\t"+accNo+"\t"+accType+"\t\t"+bal);
    }

    public static void displayRate() {
        System.out.println("Rate of Interest: " + rate + "%");
    }

    public static void main(String[] args) {
        System.out.println("Name\tAccount Number\tAccount Type\tBalance");
        BankAccount account1 = new BankAccount();
        account1.display();
        BankAccount.displayRate();

        BankAccount account2 = new BankAccount("John", 12345, "Savings", 5000, 4.0);
        account2.display();
        BankAccount.displayRate();
        account2.deposit(2000);
        account2.display();
        account2.withdraw(3500);
        account2.display();
    }
}
