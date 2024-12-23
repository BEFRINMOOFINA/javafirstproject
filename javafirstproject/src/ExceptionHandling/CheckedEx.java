package ExceptionHandling;
//Checked -->Compile time
public class CheckedEx {
	public static void main(String[] args)  {
			
				try {
					Class.forName("exceptionex.MovieEx123");
				 System.out.println("Class found");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Class not found : "+e);
				}
				
		
		
	}


}