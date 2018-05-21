package stringsdemo;
/*my name is sunny 

as


sunny
is
name
my
*/
public class demo5 {
public static void main(String[] args) {
	String name="my name is sunny";
	String[] namearr=name.split(" ");
	for(int i=namearr.length-1;i>=0;i--)
	{
		System.out.print(namearr[i]+"  ");
	}
}
}
