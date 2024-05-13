public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int num = 2; // Start from 2, the first prime number

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
