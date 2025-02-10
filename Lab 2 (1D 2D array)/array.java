import java.util.*;
class array{
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		int a[]=new int[n];
		//System.out.println("Enter"+n+"integers");
		for (int i=0;i<n;i++)
			a[i]=i+1;
		System.out.println("The array is:");
		for(int c=0;c<n;c++)
			System.out.println(a[c]);
	}
}	
