package ExceptionHandling;
class InvalidAgeException extends Exception {
	public InvalidAgeException (String msg) {
		super (msg);
	}
}
public class VotingEx {
	String voteValidity (int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Invalid age for voting");
	}
		else {
			return "Welcome to Vote";
		}
	}
public static void main(String[] args) {
	VotingEx v=new VotingEx();
	try {
		String s=v.voteValidity (12);
		System.out.println(s);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()+" "+e);
		}
     }
}