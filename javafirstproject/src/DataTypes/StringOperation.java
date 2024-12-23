package DataTypes;

public class StringOperation {

	public static void main(String[] args) {
		//immutable-->we can not change content of string
		//literals
		String s="Hello";
		//new keyword
		String s1=new String("Hiiiii");
		String s2="hiiiii";
		System.out.println("Length: "+s1.length()); 
		System.out.println("Char at:"+s1.charAt(2));
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println("Lowercase: "+s1.toLowerCase());
		System.out.println("Equals: "+s1.equals(s2));
		System.out.println("Equals ignore:"+s1.equalsIgnoreCase (s2));
		System.out.println("contains"+s1.compareTo(s2));
		System.out.println("contains"+s2.compareTo(s1));
		System.out.println("indexof: "+s1.indexOf('e'));//first occurence
		System.out.println("last indexof:"+s1.lastIndexOf('e'));//last occurenc
		System.out.println("concate: "+s.concat("Programming"));//joining/add
		String s5=" ";
		System.out.println("is blank: "+s5.isBlank());//un
		System.out.println("is empty :"+s5.isEmpty());//falce-length-0
	}
	
}