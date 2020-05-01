import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);



        System.out.println("Please enter a number");
        int number = input.nextInt();

        System.out.println("You entered: " + number);


        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println("you entered: " + word1);
        System.out.println("and: " + word2);
        System.out.println("and: " + word3);

        System.out.println("Please enter a sentence");
        String sentance = input.nextLine();
        System.out.println("you typed: " + sentance);
    }
}
