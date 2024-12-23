package Oops;
//MethodOverloading--->compile time polymorphism-->Early Binding
public class MethodOverloading {
	void add(int a) {
		System.out.println("Addition with 1 parameter: "+(++a));
	}
	void add(int a, int b) {
		System.out.println("Addition with 2 parameters: "+(a+b));
	}
	void add (int a, int b,int c) {
		System.out.println("Addition with 2 parameters: "+(a+b));
	}
    void add(float a, int b) {
    	System.out.println("Addition with 2(float+int) parameter: "+(a+b));
    }
    void add(int a, float b) {
    	System.out.println("Addition with 2(int+float) parameter: "+(a+b));
    }
    public static void main(String []args){
    	MethodOverloading m=new MethodOverloading();
    	m.add(30);
    	m.add(16,25);
    	m.add(10, 20, 50);
    	m.add(12.5f,20);
    	m.add(14,67.56f);
    }
}