package stringsdemo;

public class demo3 {
	/*my name is sunny
	
	 	as
    ynnus si eman ym*/
public static void main(String[] args) {
	String name="my name is sunny";
	String temp=null;
	String[] tempstr=name.split(" ");
	for(int i=tempstr.length-1;i>=0;i--)
	{
		//System.out.println(tempstr[i]);
		temp=tempstr[i];
		for(int j=temp.length()-1;j>=0;j--)
		{
			System.out.print(temp.charAt(j));
		}
		System.out.print(" ");
	}
}
}
