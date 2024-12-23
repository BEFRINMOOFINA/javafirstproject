package DataTypes;
public class SumOfDigit {
	public static void main(String[] args) {
		int no=333, d, sum=0;
		while(no!=0) {
			d=no%10;
			sum=sum+d;
			no=no/10;
        }
		System.out.println("sum of digit for 555" +sum); 
}
}