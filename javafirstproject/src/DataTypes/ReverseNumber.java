package DataTypes;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=765;
		int reversed=0;
		while(num!=0)
		{
		int d=num%10;
		reversed= reversed*10+d;
		num=num/10;
		}
		System.out.println("reversed number = "+reversed);
		}
}
