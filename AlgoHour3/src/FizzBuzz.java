import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter a number: ");
        n = keyboard.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.print("FizzBuzz ");
            else if(i % 5 == 0)
                System.out.print("Buzz ");
            else if(i % 3 == 0)
                System.out.print("Fizz ");
            else
                System.out.print(i + " ");
        }//for i

        keyboard.close();
    }//main
}
