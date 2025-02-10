import java.util.*;

class STUDENT{
	String sname;
	int marks_array[]=new int[100];
	int total;
	float avg;

	public int assign(){
		Scanner stu=new Scanner(System.in);
		System.out.println("Enter name:");
		sname=stu.next();
		int n;
		System.out.println("Enter no. of subjects:");
		n=stu.nextInt();
		for(int i=0;i<n;i++)
			marks_array[i]=stu.nextInt();
		return n;
	}
	
	public void compute(int n){
		for (int i=0;i<marks_array.length;i++)
			total+=marks_array[i];
		avg=total/n;
	}
	
	public void display(int n){
		System.out.println("name: " +sname);
		System.out.println("Marks: ");
		for(int i=0; i<n;i++)
			System.out.println(marks_array[i]);	
		System.out.println("total marks: " +total);
		System.out.println("average marks: " +avg);
	}

	public static void main(String[] args){
		STUDENT tejdeep=new STUDENT();
		int p=tejdeep.assign();
		tejdeep.compute(p);
		tejdeep.display(p);
	}
}
