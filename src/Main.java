public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Counter counter = new Counter();

        // Generate a random number for an interval given by the user
        fibonacci.generateNumber(10);

        int number = fibonacci.getNumber();

        // Generate the Fibonacci sequence from 0 to a given value range (random in this case)
        System.out.println("Fibonacci sequence: " + fibonacci.fibonacci(number));

        // Calculate the number of prime and odd numbers.
        counter.countPrimeAndOdd(number);

    }
}