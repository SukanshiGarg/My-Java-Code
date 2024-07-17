public class basicmaths {
    public static void main(String[] args) {
        int number = 30; // Replace with any integer you want to find divisors for
        System.out.println("Divisors of " + number + " are:");
        primeNum(number);
        
    }

    public static void divisorsNum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }


    public static void divisorNumb(int n) {
        int i = 0;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
        for (i = i - 1; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.println(n / i);

            }
        }

    }

    public static void primeNum(int n) {
        int i;
        if (n <= 1) {
            System.out.println(false);// 0 and 1 are not prime
            return;
        }
        boolean isPrime = true;
        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime);
    }
}
