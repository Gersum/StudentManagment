package StudentManagement;

import java.io.IOException;
import java.util.Scanner;

public class LogIn {

	public static boolean admin() throws IOException {//for checking the admin password and user name

		int password = FileFunction.readAdminPassword();//reading and assigning the password from the file 
		String username = "admin";
		String user_name;
		int enterd_password;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 3; i >= 1; i--) {//the loop for giving three chances to the user
			System.out.println("Enter user name ");
			user_name = input.next();
			System.out.println("Enter the password");
			enterd_password = input.nextInt();
			counter++;
			if (enterd_password == password & user_name.equalsIgnoreCase(username)) {
				System.out.println("welcome " + user_name);
				return true;
			}
			if (counter < 3) {

				System.out.println("Incorrect!!! try again...\n You have " + (i - 1) + " more chance!!\n");
			} else {
				System.out.println("::::::::::::sorry You have finished your chance:::::::::");
				break;
			}
		}
		return false;

	}
}
