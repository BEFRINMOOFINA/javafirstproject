package Oops;
abstract class College {
	abstract void collegeName();//method without body--Abstract
     void areaOfColleges() {
     //method with body-->concreate 
     System.out.println("Chennai Colleges");
     }
}
class SRM extends College{
	@Override
	void collegeName() {
		System.out.println("SRM College");
	}
}
class Hindustan extends College{
	@Override
	void collegeName() {
		System.out.println("Hindustan College");
	}
}
public class AbstractionEx {
	public static void main(String[] args) {
		SRM s =new SRM();
		s.collegeName();
		Hindustan h =  new Hindustan();
		h.collegeName();
		h.areaOfColleges();
	}
}