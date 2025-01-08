import java.util.*;

/**
 * Class main class with the main method
 * The runner for the code
 * @author Adelle.Kang
 * @version 1.0.0
 */

public class Tester{
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);

        System.out.println("What is your number?: ");
        double num = in.nextDouble();

        Number test = new Number(num);

        while(true){
            System.out.println("Would you like to add or subtract to your number? (1 for Add, 2 for Subtract, 3 to Quit)");
            double choice = in.nextInt();

            if(choice == 1){
                System.out.println("How much would you like to add?");
                double number = in.nextDouble();
                test.add(number);
                System.out.println(test);
            }

            else if(choice == 2){
                System.out.println("How much would you like to subtract?");
                double number = in.nextDouble();
                test.subTract(number);
                System.out.println(test);
            }

            else if(choice == 3){
                break;
            }

            else{
                System.out.println("Invalid Choice. Please Try Again.");
            }
        }

        System.out.println("You are now done. Your final number is " + (test.getNum()));

    }
}
 