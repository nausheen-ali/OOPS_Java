class stack{
	int size=100;
	int arr[] = new int[size];
	int top=-1;

	public void push (int ele) throws overflow
	{
		if(top!=size-1)
		{
			top++;
			arr[top]=ele;
		}
		else
		{
			throw new overflow();
		}
	}
	
	public int pop() throws underflow
	{	
		if(top==-1)
		{
			throw new underflow();
		}
		else
		{
		int ele=arr[top--];
		return ele;
		}
	}

	public void display()
	{
		for (int i=0; i<=top; i++)
			System.out.println(" "+arr[i]+" ");
	}
}

class overflow extends Exception{
	overflow(){
		System.out.println("Stack overflow");
	}
}

class underflow extends Exception{
	underflow(){
		System.out.println("Stack underflow");
	}
}


class error{
	public static void main(String[] args) throws overflow, underflow{
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println("Popped element: " +s.pop());
		System.out.println("Popped element: " +s.pop());
		System.out.println("Popped element: " +s.pop());
		System.out.println("Popped element: " +s.pop());
	
	}
}
