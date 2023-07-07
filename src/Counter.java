public class Counter {
        int odd = 0;
        int even = 0;

        // for loop to check for odd and even numbers and count each.
    public void countPrimeAndOdd(int h){
        for (int i = 0; i <= h; i++) {
            if (i % 2 == 1)
                odd++;
            else if (i % 2 == 0)
                even++;
        }
        System.out.println("Even count is : " + even);
        System.out.println("Odd count is : " + odd);
    }

}
