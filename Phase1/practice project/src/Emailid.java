import java.util.Scanner;

public class Emailid {
public static void main(String [] args)
{
	String[] emailIds = {"virat12@gmail.com","ram22@gmail.com","sai4444@gmail.com"};
	
	Scanner sc  = new Scanner(System.in);
System.out.println("Enter emailid");
	while(true) {
		String s = sc.next();
		System.out.println(Emailid.search(emailIds, s));
	}
	
	

}

static boolean search(String[] emailIds, String emailId) {
	
	for(String mail: emailIds) {
		if(mail.equals(emailId))  {
			return true;
		}
	}
	return false;
}

}