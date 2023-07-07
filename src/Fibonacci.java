public class Fibonacci {
    private int number;

    // This function will generate a random number between 0 and the number given by the user and set his value to the number variable
    public void generateNumber(int interval) {
        setNumber((int) Math.floor(Math.random()*interval));
        System.out.println("Your random number is: " + number);
    }

    // This function will generate the Fibonacci sequence from 0 to a given value range.
    public long fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    private void setNumber(int n) {
        this.number = n;
    }
}
