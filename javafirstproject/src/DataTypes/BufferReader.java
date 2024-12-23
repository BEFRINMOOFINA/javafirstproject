package DataTypes;

import java.io.BufferedReader;
import java .io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException{
		//Take input from user-->BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name,roll no,percentage,symbol");
		String name=br.readLine();
		//convert String into int
		int rno=Integer.parseInt(br.readLine());
		float per=Float.parseFloat(br.readLine());
		char ch=br.readLine().charAt(0);
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rno);
		System.out.println("Percentage: "+per);
		System.out.println("character: "+ch);
		
	}


}