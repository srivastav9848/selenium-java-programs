package arrays;

public class EvenNumbersInArray {
/*
 * 
 * print only even numbers in an array
 */
	public static void main(String[] args) {
		int[] num= {5,10,12,23,7,4,8};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}
		
	}
}
