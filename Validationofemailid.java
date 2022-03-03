
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validationofemailid
{
	public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		///initialize the Pattern object
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches(); 
		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 /// valid email addresses
		 emails.add("Shivakumar@example.com");
		 
		 emails.add("Shivakumar@example.me.org");
		 //invalid email addresses
		 emails.add("Shivakumar.example.com");
		 
		 emails.add("shivu..example.com");
		 
		 emails.add("shiva345 example.com");
		 for (String value : emails) {
		 System.out.println("The Email address " + value + " is:" + (isValidEmail(value) ? 
		"valid" : "invalid"));
		 } 
		 System.out.println("===============================================");
		 System.out.println("ENTER YOUR MAIL TO CHECK :");
		 try (Scanner sc = new Scanner(System.in)) {
		String input = sc.nextLine(); 
		System.out.println("The Email Address " + input + " is:" + (isValidEmail(input) ? "valid" : "invalid"));
		}
		 }
		}


