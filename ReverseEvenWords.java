
public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "When the world realise its own mistake, corona will dissolve automatically"; 
String [] inputsplit=input.split(" ");
System.out.println("the count of words in the sentence :" + inputsplit.length );

     for(int i=0;i < inputsplit.length ;i++)
      {
	   if((i%2)!=0)
		  
	          {  //Stringbuffer can hav only input as String.
		   StringBuffer buffer = new StringBuffer(inputsplit[i]);
		   //unlike String class,Stringbuffer object can  change its value,it is mutable
		         inputsplit[i] = buffer.reverse().toString(); 
	          }	   	 
       }
    //now the changed values are stored in inputsplit string,we hav to print it out. 
     System.out.println("The new sentence is :");
      for(int i=0;i < inputsplit.length ;i++)
        {
        System.out.print(inputsplit[i] + " ");
	    }

  }
  }
//StringBuilder is asynchronised and not thread safe,so it is faster.
//StringBuffer is synchronised and thread safe,so it is slower,no 2 threads can call the StringBuffer method
//simultaneously