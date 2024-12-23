package Oops;
class Animals {
	String type;
	public Animals(String type) {
		this.type= type;
    }
	void displayAnimals() {
		System.out.println("Amimals:parent"+type);
	}
}
class Dog extends Animals{
	String color;
	public Dog(String type, String color) {
		super(type);
		this.color= color;
   }
   void displayDog() {
	   System.out.println("Dog:child "+type+"color:"+this.color);
   }
}
public class Inheritance {
	public static void main(String[] args) {
		Dog d=new Dog("Golden Retriever", "Urk Golden");
		d.displayDog();
		d.displayAnimals();
	}
}