import java.util.Scanner;

public class DemoJava {

	public static void main(String[] args) {
	    String pass = "123";
		System.out.println("Enter Password: ");
		Scanner scanpass = new Scanner(System.in);
		String inputPassword = scanpass.next();
		
		int count = 0;
		
		while (count < 2) {
			if (inputPassword.equals (pass)) {
				System.out.println("You are now logged in");
			}
			else{
				System.out.println("Wrong password, try again");
				inputPassword = scanpass.next();
			}
			count++;
			
		}
		
		if(count > 1) {
			System.out.println("You have entered wrong password three times, exiting...");
			System.exit(0);
		}
		
		

	}

}
