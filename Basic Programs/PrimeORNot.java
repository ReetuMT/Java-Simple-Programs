public class PrimeOrNot {
    public static void main(String[] args) {
        int n=9;
        int m=n/2;
        int flag=0;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n + " is the Prime Number");
                flag=1;
                break;
            }
        }
        if(flag==0){
         System.out.println("Not a prime Number");
     }
 
    }
}