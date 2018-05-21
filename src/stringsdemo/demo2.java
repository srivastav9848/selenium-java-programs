package stringsdemo;

public class demo2 {
	/*my name is sunny
	
	   	as
	
	   	ym eman si ynnus*/
public static void main(String[] args) {
	String temp=null;
	String name="my name is sunny";
	
	String[] namearr=name.split(" ");
	//System.out.println(namearr.length);
	//System.out.println(namearr[0]);
	for(int i=0;i<=namearr.length-1;i++)
	{
		temp=namearr[i];
		//System.out.println(temp);
		for(int j=temp.length()-1;j>=0;j--)
		{
			
			System.out.print(temp.charAt(j));
		}
		System.out.print(" ");
	}
}
}
