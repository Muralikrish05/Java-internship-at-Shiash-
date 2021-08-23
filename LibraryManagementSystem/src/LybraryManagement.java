import java.util.*;
public class LybraryManagement extends AddStudent{

	/*private static final String A = null;
	private static final String a = null;
	private static final String R = null;
	private static final String r = null;
	private static final String S = null;
	private static final String s = null;*/

	public static void main(String[] args) {
		System.out.println("Hii Admin!!!!!\nWelcome to your work again........\n ");
		System.out.println("Enter '1' for add the student record");
		System.out.println("Enter '2' for add the new book");
		//System.out.println("Enter 'R' for remove the student");
		//System.out.println("Enter 'r' for remove the book");
		//System.out.println("Enter 'S' for watch the student list");
		//System.out.println("Enter 's' for watch the book list");
		//System.out.println("Enter 'Q' for quit");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();

	
		switch(x) {
		case 1:
			Addstudent1();
			break;
		case 2:
			Addbook();
			break;
		/*case R:
			RemoveStudent();
			break;
		case r:
			RemoveBook();
			break;
		case S:
			ShowStudent();
			break;
		case s:
			ShowBook();
			break;*/
		default:
			System.out.println("Please choose the correct option;");
		}
		
		
			

	}

}
