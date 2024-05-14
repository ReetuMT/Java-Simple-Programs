// Find the Factorial number
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Factorical Number:");
        int num=scanner.nextInt();
        int fact=1;
        
        for(int i=num;i>=1;i--){
           fact=fact*i;

        }
        System.out.println("Factorial of 5 is: "+fact);    
        scanner.close();
    }
}
