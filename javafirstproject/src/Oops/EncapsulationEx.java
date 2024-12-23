package Oops;
class Student {
	private int eno;
    private String ename;
    public int getEno() {
    	return eno;
    }
    public void setEno(int eno) { 
    	this.eno= eno;
    }
    public String getEname() {
    	return ename;
    }
    public void setEname(String ename) {
    	this.ename=ename;
    }
}
    public class EncapsulationEx {
    	public static void main(String[] args) {
    		Student s =  new Student();
    		s.setEno(3);
    		s.setEname("befii");
    		System.out.println("Eno:"+s.getEno());
    	    System.out.println("Ename:"+ s.getEname());
    	}
    }

