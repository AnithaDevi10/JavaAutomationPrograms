
public class CommonNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
 for(int eachnum:array1)
     { for(int eachval:array2)
        { if(eachnum==eachval)
        	System.out.println("the common value is "+eachnum );
        }//for
          }//for
		
	}//main

}//class
