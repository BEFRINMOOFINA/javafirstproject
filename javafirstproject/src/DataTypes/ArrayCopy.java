package DataTypes;
public class ArrayCopy {
	public static void main(String[] args) {
		int intArray[]= {0,1,2,3,4,5,6,7,8,9};
        int cloneArray[]= intArray.clone();
        System.out.println("Deep copy: "+(intArray == cloneArray));
        for (int i=0; i < cloneArray.length; i++) { 
        	System.out.print(cloneArray[i]+" "); 
        }
	    int intArray1[][]= {{1,2,3,4,5},{6,7,8,9,10}};
        int cloneArray1[][]= intArray1.clone();
        System.out.println();
        System.out.println("Shallow Copy: " +(intArray1[0][0] == cloneArray1[0][0]));
   }
}