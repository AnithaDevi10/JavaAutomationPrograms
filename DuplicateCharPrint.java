import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a java program to print the duplicate character using Collections Framework.
	//	Input: "When life gives you lemons, make lemonade"
		String str="When life gives u lemons,make lemonade";
		char[] chstr=str.toCharArray();
		Set<Character> charset= new LinkedHashSet <Character> ();
		Set<Character> dupcharset=new LinkedHashSet <Character>();
		
		for(Character eachch:chstr)
		   {     if(!charset.add(eachch)) 
			   //as set contains unique values,if not,add in dupcharset which contains repeated charcters only once
		           dupcharset.add(eachch);
      			
		    }
		//as collections like Set,List,Map use only wrapper class
		
	//as dupcharset conatins duplicate (repeated) charcter seperated by commas	
		for(Character each:dupcharset)
		{
			if(each!=' ')

				//when u dont want empty space
			System.out.println(each + ",");
		}
			
			
		
		

	}

}
