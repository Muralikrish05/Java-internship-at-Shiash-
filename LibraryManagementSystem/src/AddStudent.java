import java.util.*;

 class AddStudent /*implements Management*/ {
	//public static void main(String[] args) 
	 public static void Addstudent1()
	 {
		System.out.println("Enter a name of the new student");
		Scanner s = new Scanner(System.in);
		String N =s.next();
		System.out.println("Enter a roll no of the new student");
		int R=s.nextInt();		
		System.out.println("Enter a age of the new student");
		int a=s.nextInt();
		System.out.println("Enter the contact number of the new student");
		long no=s.nextLong();
		System.out.println("Enter the department of the new student");
		String r=s.next();
		
		System.out.println("Do you need the details of registered student\nif YES type '1'\nElse type'0' ");
		int x=s.nextInt();
		switch(x) {
		case 1:
			System.out.println(N+"\n"+R+"\n"+a+"\n"+no+"\n"+r+"\nTHAT'S ALL ABOUT THE STUDENT");
			break;
		default:
			System.out.println("Student ADDED successfully");
			break;
		}
		//main();
	}

public static void Addbook() {
		System.out.println("Enter a name of the new Book");
		Scanner s = new Scanner(System.in);
		String N =s.next();
		System.out.println("Enter a ID no of the new Book");
		int R=s.nextInt();		
		System.out.println("Enter a Authername of the new Book");
		String a=s.next();
		System.out.println("Enter the contact number of Author the new Book");
		long no=s.nextLong();
		System.out.println("Enter the department of the new Book");
		String r=s.next();
		
		System.out.println("Do you need the details of registered Book\nif YES type '1'\nElse type'0' ");
		int x=s.nextInt();
		switch(x) {
		case 1:
			System.out.println(N+"\n"+R+"\n"+a+"\n"+no+"\n"+r+"\nTHAT'S ALL ABOUT THE Book");
			break;
		default:
			System.out.println("Book ADDED successfully");
			break;
		}
	}
}

