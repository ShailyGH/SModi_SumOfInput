import java.util.Scanner;

class Sum
{
    // do this one and the lab is complete. really.
// return the sum of 0 to n... if n == 3, the result should be 6

    /*
    public int sumOfNumbersUsingForLoop(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }
    */

    public int sumOfNumbersUsingWhileLoop(int n) {
        int sum = 0;

        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
}