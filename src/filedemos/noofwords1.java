package filedemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class noofwords1 {
public static void main(String[] args) throws IOException {
	File file=new File("empdetails.txt");
	FileInputStream fis=new FileInputStream(file);
	InputStreamReader input=new InputStreamReader(fis);
	BufferedReader reader=new BufferedReader(input);
	String line;
	int linecount=0;
	int wordcount=0;
	while((line=reader.readLine()) !=null)
	{
		//linecount++;
		if(!(line.equals("")))
				{
			String[] w=line.split("\\s+");
			wordcount=wordcount+w.length;
				}
		
	}
	System.out.println(linecount);
	System.out.println(wordcount);
	reader.close();
}
}
