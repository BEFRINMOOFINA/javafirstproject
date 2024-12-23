package Oops;
class Fruits{
	void Banana(){
		System.out.println("Banana");
     }
  }
class orange extends Fruits{
	void orange() {
		System.out.println("orange");
	}
}
class Grape extends orange {
	void grape() {
		System.out.println("Grape");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Grape s=new Grape();
		s.Banana();
		s.grape();
		s.orange();
	}
}