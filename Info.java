import java.util.Scanner;
public class Info
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice,age=0;
		String name=null,des=null;
		double sal=0.0;
		do{
		System.out.println(" ");
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.Raise salary");
		System.out.println("4.Exit");
		System.out.println("===============================");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.println("Enter the name");
				name=sc.next();
				System.out.println("Enter the age");
				 age=sc.nextInt();
				System.out.println("Enter the salary");
				 sal=sc.nextDouble();
				System.out.println("Enter the designation");
				 des=sc.next();
				break;


			case 2:System.out.println("Name="+name);
				System.out.println("Age="+age);
				System.out.println("Salary="+sal);
				System.out.println("Designation="+des);
				break;


			
			case 3:sal=sal+1000;
				System.out.println("Salary is raised");
				break;

			
			case 4:break;
			
		
		}
		
		}while(choice!=4);
		
		
}
}

				
