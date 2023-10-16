import java.util.Scanner;
public class Recursive {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        int temp = 0;

        System.out.print("Enter a number: ");
        temp = keyboard.nextInt();
        n = 1;

        fizzBuzz(n, temp-1);
       
        keyboard.close();
    }//main

    public static void fizzBuzz(int n, int temp){
        if(n % 3 == 0 && n % 5 == 0)
            System.out.print("FizzBuzz ");
        else if(n % 5 == 0)
            System.out.print("Buzz ");
        else if(n % 3 == 0)
            System.out.print("Fizz ");
        else
            System.out.print(n + " ");

        if(temp > 0){
            n++;
            temp--;
            fizzBuzz(n, temp);
        }
    }//fizzBuzz

}//Recursive
