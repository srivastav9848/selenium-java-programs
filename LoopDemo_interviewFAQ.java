/*
 ##print the following sequence of a String "Automation"
A 
Au 
Aut 
Auto 
Autom 
Automa 
Automat 
Automati 
Automatio 
Automation 


 
 
 */
package programs;

public class LoopDemo_interviewFAQ {
public static void main(String[] args) {
	String var="Automation";
	for(int i=0;i<var.length();i++) {
		for(int j=0;j<=i;j++)
		{
		System.out.print(var.charAt(j));
		}
		System.out.println(" ");
	}
	
	
}
}
