import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to remove duplicates from a list?  List = "A,B,C,D,A,D,E,F"
		//Get it in List and put it in Set
		List<String> initList= new ArrayList<String> ();
		initList.add("A");
		initList.add("B");
		initList.add("C");
		initList.add("D");
		initList.add("A");
		initList.add("D");
		initList.add("E");
		initList.add("F");
		Set<String> uniqueset=new LinkedHashSet<String>(initList);
		for(String str:uniqueset)
			System.out.println(str);				
	}

}
