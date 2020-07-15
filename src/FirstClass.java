public class FirstClass {


    public static void main (String [] args) {

        System.out.println(recur(5)); // For calling method with argument
    }

    public static int recur (int n) { // Method for calculation factorials
        if (n <= 1) { // Factorial of 1 is 1
            return 1;
        }
        else
            return n*recur(n-1); // Method class itself (self referential)
                                // Method will stop calling itself when (n-1) =0
    }
}
