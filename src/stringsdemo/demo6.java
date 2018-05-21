package stringsdemo;


/*namo**modi

n
na
nam
namo
namo*
namo**
namo**m
namo**mo
namo**mod
namo**modi*/


public class demo6 {
public static void main(String[] args) {
	String name="namo**modi";
	for(int i=0;i<=name.length()-1;i++)
	{
		//System.out.println(name.charAt(i));
		for(int j=0;j<=i;j++)
		{
			System.out.print(name.charAt(j));
		}
		System.out.println();
	}
}
}
