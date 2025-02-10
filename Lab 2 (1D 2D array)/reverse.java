class reverse{
	public static void main(String[] args){
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;		
		System.out.println("The array is:");
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
		System.out.println("The reversed array is:");
		for (int j=a.length-1;j>=0;j--)
			System.out.println(a[j]);
	}
}

