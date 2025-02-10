import java.util.*;
class EMPLOYEE{
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;
    public void read (Scanner sc){
        System.out.println("Enter Employee Name:");
        Ename=sc.next();
        System.out.println("Enter Employee ID:");
        Eid= sc.nextInt();
        System.out.println("Enter Basic Salary:");
        Basic = sc.nextDouble();
        compute_net_sal();
   }
   public void compute_net_sal(){
    DA = 0.52*Basic;
    Gross_Sal=Basic+DA;
    double IT = 0.30 * Gross_Sal;
    Net_Sal = Gross_Sal - IT;
   }
   public void display(){
    System.out.println("Employee Name:" +Ename);
    System.out.println("Employee ID:" +Eid);
    System.out.println("Basic Salary:" +Basic);
    System.out.println("DA:" +DA);
    System.out.println("Gross Salary:" +Gross_Sal);
    System.out.println("Net Salary:" +Net_Sal);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of employees:");
        int N = sc.nextInt();
        EMPLOYEE[] employees= new EMPLOYEE[N];
        for(int i =0; i<N;i++){
            employees[i]=new EMPLOYEE();
            System.out.println("enter details for employee "+(i+1));
            employees[i].read(sc);
        }
        for (int i=0; i<N;i++){
            System.out.println("details of employee "+(i+1));
            employees[i].display();
        }
    }
}
