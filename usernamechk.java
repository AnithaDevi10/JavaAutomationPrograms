import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class usernamechk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Testleaf$123";
String pattern = "[a-zA-Z0-9._$@]{8,}";
//{8,} minimum 8 charcaters should be there and maximum can be anything {8,}
//alphanumeric charcters and spl charcters are [a-zA-Z0-9._$@]
Pattern compile=Pattern.compile(pattern);
Matcher matcher= compile.matcher(str);
System.out.println(matcher.matches());
		
	}

}
/*2. Write a java program to validate the given username is valid or not
Input: "Balaji_1"
output: false
Input: "Testleaf$123"
output: false
Note: 
1. It should contain minimum 8 characters.
2. It allows alpha numeric characters and spl characters like . _ @ $
*/