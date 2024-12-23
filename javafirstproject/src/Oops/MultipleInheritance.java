package Oops;
interface Vegetable1{
	//abstract, default, static
	void vegetable1();
}
interface Vegetable2{
	void vegetable2();
}
class Vegetable implements Vegetable1, Vegetable2{
	@Override
	public void vegetable1() {
		System.out.println("Tomato");
	}
    @Override
    public void vegetable2() {
    	System.out.println("Potato");
    }
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Vegetable m =new Vegetable();
		m.vegetable1();
		m.vegetable2();
	}
  }