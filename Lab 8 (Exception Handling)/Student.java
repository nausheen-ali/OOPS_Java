import java.util.*;
class seatsFilledException extends Exception{
    seatsFilledException(String message){
        super(message);
    }
}

class Student{
    int regNo;
    String name;
    GregorianCalendar doj;
    short sem;
    float gpa,cgpa;
    static int count;
    Student(String n, GregorianCalendar date, short sem, float gpa, float cg){
        this.name=n;
        this.doj=date;
        this.sem=sem;
        this.gpa=gpa;
        this.cgpa=cg;
        this.regNo=doj.get((GregorianCalendar.YEAR)%100)*100+ ++count;
    }
    void checkRegNo () throws seatsFilledException{
        int n=this.regNo%100;
        if (n>=25)
            throw new seatsFilledException("\n Seats Filled");
    }
    public static void main(String[] args) throws seatsFilledException{
        Scanner sc = new Scanner (System.in);
        System.out.println("enter nymber of students (min 5)");
        int n;
        do{
            n=sc.nextInt();
        }while(n<5);
        sc.nextLine();
        Student Students[] = new Student[n];
        try{
            System.out.println("enter name, date(ddmmyyyy),sem,gpa,and cgpa");
            for(int i=0;i<n;i++){
                String name = sc.nextLine();
                int day = sc.nextInt();
                int month = sc.nextInt()-1;
                int year = sc.nextInt();
                short sem = sc.nextShort();
                float gpa= sc.nextFloat();
                float cgpa = sc.nextFloat();
                sc.nextLine();
                name=name.replace("\"","").replace("'","");
                GregorianCalendar doj= new GregorianCalendar(year,month,day);
                Students[i]=new Student(name,doj,sem,gpa,cgpa);
                Students[i].checkRegNo();
            }
        }
        catch(seatsFilledException e){
            System.out.println("\n" +e.getMessage());
        }
    }
}
