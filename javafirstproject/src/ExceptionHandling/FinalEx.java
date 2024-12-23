package ExceptionHandling;
//if we declare parent class as final we can't extend in subclass
//final class Emp{
//	
//}
//class Dept extends Emp{
//	
//}
//if we declare any method as final-->can't overide
class Emp{
	final void dis() {
		System.out.println("Display method");
	}
}
class Dept extends Emp{
	void dis() {
		super.dis();
		System.out.println("Display of dept method");
	}
}
public class FinalEx {
	final int a=10;
	int b=10;
	public static void main(String[] args) {
		FinalEx f=new FinalEx();
		//f.a=23;-->we can not change value of final variable->Constant
		f.b=20;


	}


}
