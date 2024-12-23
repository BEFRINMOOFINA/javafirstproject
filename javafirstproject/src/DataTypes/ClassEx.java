package DataTypes;
public  class ClassEx{
public static class Student{
	int rno;
    String name;
    public Student() {
    	this.rno = 3;
    	this.name ="Abii";
    	System.out.println("Default constructor");
    	System.out.println("Rollno: "+ rno);
    	System.out.println("Name: " + name);
    }
    public Student(int rno, String name) {
    	this.rno=rno;
    	this.name= name;
    	System.out.println("Parameterized constructor");
    	System.out.println("Rollno:"+ this.rno);
         System.out.println("Name: "+ this.name);
    }
    //Copy constructor
    public Student(Student other) {
    	this.rno= other.rno;
        this.name = other.name;
        System.out.println("Copy constructor");
        System.out.println("Rollno: " + this.rno);
         System.out.println("Name: "+this.name);
    }
    public static void main(String[] args) {
    	Student s1= new Student();
    	Student s2= new Student(12, "ABC");
    	Student s3=new Student(s1);
    }
 }

}