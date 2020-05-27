
public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array= {20, 30, 25, 35, -16, 60, -100};
		 int sum=0;
		 for(int i=0;i<array.length;i++)
			 sum=sum+array[i];
		 System.out.println("Average value is " +sum/array.length );
	}

}
