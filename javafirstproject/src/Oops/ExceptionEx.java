package Oops;
import java.io.IOException;
public class ExceptionEx {
	//CheckedException-Compiletime-->SQLException, IOException, ClassNotFoundException
	public static void main(String[] args) throws IOException{
		try {
			Class.forName("loop. WhileEx");
			System.out.println("class found");
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			}catch (ClassNotFoundException e)  {
				System.out.println("class not found "+e);
			    //e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}