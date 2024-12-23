package DataTypes;

public class CountEx {
	public static void main(String[] args) {
		String s1 = "Welcome to the World";
		s1 = s1.trim();
		String[] w = s1.split(" ");
		for(int i=0;i<w.length; i++) {
		System.out.println(i+"->"+w[i]);
		int Countc= w.length;
		System.out.println("Number of words: "+ Countc);

		}
	}
}