package DataTypes;
import java.util.Scanner;
public class InputScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Name: "+name);
		System.out.println("Enter your Rollno");
		int rollno=sc.nextInt();
		System.out.println("Rolino:"+rollno);
		System.out.println("Enter your Precentage");
		float precentage=sc.nextFloat();
		System.out.println("Percentage:"+precentage);
		System.out.println("Enter Symbol");
		char ch=sc.next().charAt(0);
		System.out.println("Symbol:"+ch);
	}
}
