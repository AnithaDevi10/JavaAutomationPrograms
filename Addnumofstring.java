
public class Addnumofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: "asdf1qwer9as8d7"
		//	output: 1+9+8+7 = 25
String str="asdf1qwer9as8d7sdf6fgh5";
int sum=0;
String strnum=str.replaceAll("[a-z]", "");
System.out.println(strnum);
int numval=Integer.parseInt(strnum);
System.out.println(numval);

	   while(numval>0)
	   {
		  sum = sum +(numval%10);
		  System.out.println("sum "+sum);
		  
		  numval=numval/10;
		  System.out.println("numval "+numval);
		 	
	   }
	   System.out.println("the sum value is :"+ sum);
		
	
     }
		
	}


