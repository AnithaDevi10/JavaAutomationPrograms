
public class Findoccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="You have no choice other than following me!";
 String repstr=str.replaceAll("[^o]", "");
 System.out.println("the replaced string is :" +repstr);
 System.out.println("The occurrences of o "+ repstr.length());
	}

}
