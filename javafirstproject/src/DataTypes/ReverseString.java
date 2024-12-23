package DataTypes;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a string value");
        String name =sc.nextLine();
        String reversed ="";
        for(int i=name.length()-1;i>=0;i--)
        {
        	reversed +=name.charAt(i);
        }
        System.out.println("original string = "+name);
        System.out.println("Rrversed String = "+reversed);
	}
}