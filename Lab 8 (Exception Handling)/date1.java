import java.util.*;

class CurrentDate{
	int day;
	int month;
	int year;

	public void createDate(CurrentDate d)
	{
		Scanner sc= new Scanner(System.in);
		//CurrentDate d= new CurrentDate();

		System.out.println("Enter date: ");
		d.day=sc.nextInt();

		System.out.println("Enter month: ");
		d.month=sc.nextInt();

		System.out.println("Enter year: ");
		d.year=sc.nextInt();

		sc.close();
	}
	
	public void check() throws monthError,dateError{
	if(month>12){
		throw new monthError();
	}
	if(month==4 || month==6 || month==9 || month==11){
		if(day>30){
			throw new dateError();
		}
	}
	else if(month==2){
		if(day>28){
			throw new dateError();
		}
	}
	else if(day>31){
		throw new dateError();
	}

		System.out.println(day+ "/" +month+ "/" +year);
	
}
}

class monthError extends Exception{
	monthError(){
		System.out.println("Invalid Month");
	}
}

class dateError extends Exception{
	dateError(){
		System.out.println("Invalid Date");
	}
}

class date1{
	public static void main (String[] args) throws monthError, dateError{
		CurrentDate d1 = new CurrentDate();
		d1.createDate(d1);
		d1.check();
	}
}
