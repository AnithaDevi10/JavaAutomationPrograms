		import java.util.HashMap;

public class JavaCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("You have no choice other than following me");
		  
	       	
	}	 
		
		    public static void characterCount(String inputString)
		    {
		        //Creating a HashMap containing char as a key and occurrences as a value
		    	System.out.println(inputString);
		  
		        HashMap <Character, Integer> charCountMap = new HashMap <Character, Integer> ();
		  
		        //Converting given string to char array
		  
		        char[] strArray = inputString.toCharArray();
		  
		        //checking each char of strArray
		          //map.put() is to add values in map
		          //map.get() is to get the corresponding value for the key.
		        //default value for key will be zero initially
		        for (char c : strArray)
		        {
		            if(charCountMap.containsKey(c))
		            {
		                //If char 'c' is present in charCountMap, incrementing it's count by 1
		  
		                charCountMap.put(c, charCountMap.get(c)+1);
		                //incrementing the value by 1 for a key,charCountMap.get(c)
		            }
		            else
		            {
		                //If char 'c' is not present in charCountMap,
		                //putting 'c' into charCountMap with 1 as it's value
		  
		                charCountMap.put(c, 1);
		            }
		        }
		         
		        //Printing inputString and charCountMap 
		  
		        System.out.println(charCountMap);
		    }
		  
		   
	}


