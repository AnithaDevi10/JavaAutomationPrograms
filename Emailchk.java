import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailchk {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	String str = "anitha_devi@hexaware.co.in";
	String pattern="[a-zA-Z0-9._]+@[a-z0-9]+[a-z.]{2,}";
//String pattern="[A-Za-z0-9+_.-]+@(.+)$";
	Pattern compile=Pattern.compile(pattern);
	Matcher matcher=compile.matcher(str);
	System.out.println(matcher.matches());						
	}

}

//1. Write a java program to verify whether the given String is valid email address.
//Input: "balaji.chandrasekaran@testleaf.com"
//output: true
//Input: "balaji.c@tunatap.co.uk"
//output: true
//Input: "naveen e@tl.com"
//output: false
//Note: Spl characters like . _ are only allowed
//