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
After selecting first option the user can enter details .Scanner class is provided to take it from the user stored it in variable like name,sal,des and age.
                  System.out.println("Enter the name");
			            name=sc.next();
				          System.out.println("Enter the age");
				          age=sc.nextInt();
				          System.out.println("Enter the salary");
				          sal=sc.nextDouble();
				          System.out.println("Enter the designation");
				          des=sc.next();
Second option the user can view the details and in third option the salary is raised.Here do while loop is used to continue the switch case.If the user select a choice 4 it will exit.
After selecting choice 1 it will ask for user to enter name,sal and designation.
After selecting choice 2 it will display the details of the employee.
After selecting choice 3 it will raise the salary and display the message the salary is raised.
After selecting choice 4 it will exit.
