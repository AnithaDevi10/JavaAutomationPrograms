
public class PalindromeChecker {  
public static void main(String[] args){  
	String str="malayalam";
    StringBuilder sb=new StringBuilder(str);  
    //unlike String class u can change the value of string in StringBuilder class
    sb.reverse();  
    String rev=sb.toString();  
    System.out.println("the reversed string "+rev);
    if(str.equals(rev)){  
        System.out.println("It is palindrome");  
    }else{  
        System.out.println("It is not palindrome");  
    }  
}  
}  
