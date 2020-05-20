import java.util.ArrayList;
import java.util.List;

public class PrintListgnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Write a java program to print the list (Need 3 different answers)
		//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

//get the string
		//addit in list by .add() method list.add()
		//print the list by .get() method list.get()
		String str="Buggati Chiron";
		List<Character> charlist = new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
			charlist.add(str.charAt(i));
		for(int i=0;i <charlist.size();i++)
			System.out.print(charlist.get(i));
		
		
	}

}
