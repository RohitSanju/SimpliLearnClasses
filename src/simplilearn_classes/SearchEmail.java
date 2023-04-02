package simplilearn_classes;

import java.util.ArrayList;

public class SearchEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchEmail sb = new SearchEmail();
		boolean result = sb.emailValidation("abc@yahoo.com");
		
		if(result) {
			System.out.println("Emails Exists");
		}
		else {
			System.out.println("No email Exists");
		}

	}
	
	
	private boolean emailValidation(String emailSearch) {
		
		ArrayList<String> email = new ArrayList<String>();
		
		email.add("sanju.rohit@gmail.com");
		email.add("abc@yahoo.com");
		email.add("xyz@yahoo.com");
		
		boolean isEmailExists = email.contains(emailSearch);
		
		return isEmailExists;
		
		
	}

}
