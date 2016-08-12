package Examples.Prime_Numbers;

public class AllPrimeIn100 {
    public static void main(String[] args) {
        // Print all the prime numbers in 1-100
        for (int x = 2; x <= 100; x++){
            boolean isPrime = true;
            for (int y = 2; y<x; y++)
                if (x%y == 0)
                    isPrime = false;
                if (isPrime)
                    System.out.println(x);
         }

    }
}
