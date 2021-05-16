# Infojava
Program to create details, display details and raise salary of the employee.
The program will first provide choices like create details,display details and raise salary to the user.
The code which is used to display it is :
                  System.out.println(" ");
		              System.out.println("1.Create");
		              System.out.println("2.Display");
		              System.out.println("3.Raise salary");
		              System.out.println("4.Exit");
		              System.out.println("===============================");
		              System.out.println("Enter your choice");
		              choice=sc.nextInt();
The user can choose any of the option.
After selecting choice 1 it will ask for user to enter name,sal and designation.Scanner class is provided to take it from the user stored it in variable like name,sal,des and age.
                  			  System.out.println("Enter the name");
			            	  name=sc.next();
				          System.out.println("Enter the age");
				          age=sc.nextInt();
				          System.out.println("Enter the salary");
				          sal=sc.nextDouble();
				          System.out.println("Enter the designation");
				          des=sc.next();
After selecting choice 2 it will display the details of the employee.
The code to display details is :
				System.out.println("Name="+name);
				System.out.println("Age="+age);
				System.out.println("Salary="+sal);
				System.out.println("Designation="+des);
				break;
After selecting choice 3 it will raise the salary and display the message the salary is raised.
				sal=sal+1000;
				System.out.println("Salary is raised");
				break;
After selecting choice 4 it will exit.
