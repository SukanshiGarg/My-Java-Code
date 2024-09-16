package ByteBattle;
import java.util.*;

public class SpecialPrime_3divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> specialPrimes = findSpecialPrimes(n);

        // Print all the special primes
        for (int specialPrime : specialPrimes) {
            System.out.println(specialPrime);  // Print individual special primes
        }

        sc.close();
    }

    // Function to find the prime numbers up to n using the Sieve of Eratosthenes
    public static List<Integer> sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Function to return special primes up to n
    public static List<Integer> findSpecialPrimes(int n) {
        List<Integer> specialPrimes = new ArrayList<>();
        // Get the primes up to sqrt(n)
        List<Integer> primes = sieveOfEratosthenes((int) Math.sqrt(n));

        // For each prime p, if p^2 <= n, it's a special prime
        for (int prime : primes) {
            int primeSquared = prime * prime;
            if (primeSquared <= n) {
                specialPrimes.add(primeSquared);
            }
        }

        return specialPrimes;
    }
}
