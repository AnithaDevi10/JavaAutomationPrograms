
public class UpperLowerSpaceNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upper=0;int lower=0;int space=0;int number=0;
		String input="1. It is Work from Home  not Work for Home";
		char [] carray=input.toCharArray();
		for(int i=0; i < carray.length ;i++ )
		{
			if(Character.isWhitespace(carray[i]))
				space++;
			if(Character.isUpperCase(carray[i]))
				upper++;
			if(Character.isLowerCase(carray[i]))
				lower++;
			if(Character.isDigit(carray[i]))
				number++;
						}
		
		System.out.println("the number of spaces "+ space );
		System.out.println("the number of uppercaseletters " + upper);
		System.out.println("the number of lowercaseletters " + lower);
		System.out.println("the number of digits " + number);

	}

}
