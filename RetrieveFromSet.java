import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	How to retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and print only the value - 7
		//as u dont have get function in SET collection ,u need to put into list and get the value
		char [] gnarray= {'1','2','3','4','5','6','7','8','9'};
Set <Character> givenset=new LinkedHashSet<Character> ();
      for(Character each:gnarray)
          givenset.add(each);                           
List<Character> newlist =new ArrayList<Character> (givenset);
System.out.println(newlist.get(6));

//another way of implementing the program
//Set<Integer> set = new LinkedHashSet<Integer>();
//set.add(1);
//set.add(2);
//set.add(3);
//set.add(4);
//set.add(5);
//set.add(6);
//set.add(7);
//set.add(8);
//set.add(9);
//List<Integer> list = new ArrayList<Integer>(set);
//System.out.println(list.get(6));





	}

}
