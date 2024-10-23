public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 500 are:");

        // Loop through the numbers between 10 and 500
        for (int number = 10; number <= 500; number++) {
            int count = 0;

            // Check divisibility and count divisors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            // A prime number has exactly 2 divisors (1 and itself)
            if (count == 2) {
                System.out.println(number);
            }
        }
    }
}
