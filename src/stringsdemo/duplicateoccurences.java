package stringsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateoccurences {
public static void main(String[] args) {
	String name="sunny";
	char[] namearr=name.toCharArray();
	Map<Character,Integer> charmap=new HashMap<Character,Integer>();
	for(Character ch:namearr)
	{
		if(charmap.containsKey(ch))
		{
			charmap.put(ch, charmap.get(ch)+1);
		}
		else {
			charmap.put(ch, 1);
		}
	}
	
	Set<Character>chars=charmap.keySet();
	for(Character c:chars)
	{
		if(charmap.get(c)>1)
		{
			System.out.println(c+" "+charmap.get(c));
		}
	}
}
}
