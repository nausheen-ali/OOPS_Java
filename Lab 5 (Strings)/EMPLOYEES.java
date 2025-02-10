import java.util.*;
class EMPLOYEES
{
	String Ename;
	int Eid;
	double Basic;
	double DA;
	double Gross_sal;
	double Net_sal;
	String Email;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, employee ID, and basic salary of the employee");
		this.Ename = sc.nextLine();
		this.Eid = sc.nextInt();
		this.Basic = sc.nextDouble();
	}
	void compute_net_sal()
	{
		DA = 0.52 * Basic;
		Gross_sal = Basic + DA;
		double IT = 0.3 * Gross_sal;
		Net_sal = Gross_sal - (DA + IT);
	}
	void display()
	{
		System.out.println(Ename + "\t" + Eid + "\t"+Basic+"\t" + DA + "\t\t" + Net_sal+"\t"+Email);
	}
	void formatEmployeeName() 
	{
		String[] words = Ename.split(" ");
		this.Ename = "";
		for (String word : words) 
		{
			this.Ename += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
		}
		this.Ename = Ename.trim();
	}
    void generateEmail()
	{
		String name = Ename;
		name = name.trim().toLowerCase();
		String fChar = String.valueOf(name.charAt(0));
		String lName = name.substring(name.lastIndexOf(" ")+1);
		String s = fChar.concat(lName);
		Email = s.concat("@example.com");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		EMPLOYEES Employees[] = new EMPLOYEES[n];
		for(int i = 0; i < n; i++)
		{
			Employees[i] = new EMPLOYEES();
			Employees[i].read();
			Employees[i].formatEmployeeName();
			Employees[i].generateEmail();
			Employees[i].compute_net_sal();
		}
		System.out.println("Employee name\tEID\t\tbasic\tDA\t\tNet Salary\tEmail");
		for(int i = 0; i < n; i++)
		Employees[i].display();
	}
}
		