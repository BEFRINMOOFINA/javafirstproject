package Oops;
public class RunTimeException {
	public static void main(String[] args) {
		try {
			int a=10,b=5,c;
			c=a/b;
            System.out.println("Value of c:"+c);
            int arr[]= {2,3,4};
            System.out.println("Array:"+arr[2]);
		}
  catch(ArithmeticException e) {
	  System.out.println(e.getMessage());
	  System.out.println(e);
	  System.out.println("can't divide number by zero");
  }
		finally {
			System.out.println("Execute always");
		}
	}
}