package DataTypes;

public class CountOccurance {
	public static void main(String[] args) {
		String s ="HelloWorld";
	    int totalcount = s.length();
	    System.out.println(totalcount);
	    int countafterremovel = s.replace("1", "").length();
        System.out.println(countafterremovel);
        int count =  totalcount-countafterremovel;
        System.out.println("Number of Occurance:" +count);
	}
}