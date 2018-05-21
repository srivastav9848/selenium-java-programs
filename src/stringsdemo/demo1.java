package stringsdemo;
/*
 * my name is sunny
 * 
 *     as
 *     
 *     sunny is name my
 * 
 * 
 */

public class demo1 {
	public static void main(String[] args) {
		String name="my name is sunny";
		System.out.println("Given string is:  "+name);
		String[] temp=name.split(" ");
		/*for(String eachval:temp)
		{
			System.out.println(eachval);
		}*/
		for(int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]+" ");
		}
	}

}
