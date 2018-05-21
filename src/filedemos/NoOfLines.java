package filedemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfLines {
public static void main(String[] args) throws IOException {
	File file=new File("empdetails.txt");
	FileInputStream fis=new FileInputStream(file);
	InputStreamReader input=new InputStreamReader(fis);
	BufferedReader reader=new BufferedReader(input);
	//String line;
	int linecount=0;
	//int wordcount=0;
	while(reader.readLine() !=null)
	{
		linecount++;
		
	}
	System.out.println(linecount);
	reader.close();
}
}
