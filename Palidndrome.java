public class Palidndrome {
    public static void main(String[] args) {
        int n=454;
        int temp=n;
        int rev =0;
        while(n>0){
            int rem=n%10;
            rev =(rev*10) + rem;
            n=n/10;

        }
        if(rev==temp){
            System.out.println(temp + " is the parlidrom number");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
