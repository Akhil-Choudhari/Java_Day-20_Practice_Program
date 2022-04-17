package RegexProgram;

public class Regex {

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.Date;
	import javax.swing.text.Utilities;
		import java.util.*;

		public class Regex
		{
			public static void main(String args[])
			{
				Utility u=new Utility();

				RegexDetail user=new RegexDetail();
				System.out.println();
			
				System.out.println("Enter FirstName:");
				user.setfName(u.inputString());
				System.out.println();
			
				System.out.println("Enter LastName:");
				user.setlName(u.inputString());
				System.out.println();
			
				System.out.println("Enter Mobile Number:");
				user.setmobileNo(u.inputString());
				System.out.println();	
				
				
				user.setdate(u.getFormatedDate(new Date()));
				System.out.println(u.convertString(user,u.getFileText("newfile.txt")));	
			}
}
