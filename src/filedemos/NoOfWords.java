package filedemos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("empdetails.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	int count=0;
	while(line!=null)
	{
		String[] wcount=line.split("\\s+");
		for(String w:wcount)
		{
			count++;
		}
		line=br.readLine();
	}
	System.out.println(count);
}
}
