package DataTypes;
public class PalindromeNo {
    public static void main(String[] args) {
        int num2 = 258;
        int rev = 0;
        int temp = num2;
        
        // Corrected loop
        while (num2 != 0) {
            int n = num2 % 10; 
            rev = (rev * 10) + n;
            num2 = num2 / 10;
        }
        
        System.out.println("Num: " + rev);
        
        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
