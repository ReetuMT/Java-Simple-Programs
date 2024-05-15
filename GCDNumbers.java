import java.util.Scanner;

public class GCDNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the X value ");
        int num1 = sc.nextInt();
        System.out.println("Enter Y value");
        int num2=sc.nextInt();
        System.out.println("Enter GCD value");
        int gcd=sc.nextInt();
        for(int i=1;i<=num1 && i<= num2 ;i++){
            if(num1%i==0 && num2%i==0){
            gcd = i;
            }
        }
        System.out.println("GCD of %d and %d is: "+num1 + " " + num2 +"" +gcd);
        sc.close();
    }
}
