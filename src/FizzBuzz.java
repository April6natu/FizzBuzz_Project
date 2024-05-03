 class Main {
    public static void main(String[] args) {
        // Define the upper limit
        int n = 100;

        // Loop through numbers from 1 to n
        // Check if the number is divisible by both 3 and 5
        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If not divisible by 3 or 5, print the number itself
            else {
                System.out.println(i);
            }
    }
}
