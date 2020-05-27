import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {5,1,33,79,22,11,45};
		 
		 
		 //sorting array
		 Arrays.sort(array);
		 
		 System.out.println("The ascending order is : " + Arrays.toString(array));
		 
		 //sorting in descending order
	System.out.println("the reverse order is"); 
		 //Collections.reverse(Arrays.asList(array));
	       for(int i=array.length-1;i>=0;i--)
	    	   System.out.print(array[i]+",");
		 
			}

}
