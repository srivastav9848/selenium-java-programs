package stringsdemo;

/*my name is sunny


   as 
   
   my
   name
   is
   sunny*/
   
public class demo4 {
public static void main(String[] args) {
	String name="my name is sunny";
	String[] namearr=name.split(" ");
	for(int i=0;i<=namearr.length-1;i++)
	{
		System.out.println(namearr[i]);
	}
}
}
