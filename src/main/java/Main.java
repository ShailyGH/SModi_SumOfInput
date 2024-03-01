/**
 * Created by Shaily Modi on 02/28/2024
 */
public class Main {
    public static void main(String[] args){

        Sum sum1 = new Sum();

        int number = sum1.getInputNumber();

        int sum = sum1.sumOfNumbersUsingWhileLoop(number);

        System.out.println(sum);
    }
}