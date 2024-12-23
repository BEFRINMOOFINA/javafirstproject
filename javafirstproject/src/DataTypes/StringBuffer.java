package DataTypes;
public class StringBuffer{
	public static void main(String[] args) {
		//Mutable-->We can change content
		//StringBuffer sb=new StringBuffer("hello");
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("Before append string :"+sb);
		sb.append("  Java");
		System.out.println("My string :"+sb);
		sb.insert(5, "Hi ");
		System.out.println("My string :"+sb);
		sb.delete(5, 8);
		System.out.println("After deletion string :"+sb);
		sb.reverse();
		System.out.println("Reverse string :"+sb);
	
	}

}

