import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to say?");
        String userInput = scanner.nextLine().trim();
        System.out.println("you said " + userInput);

        if(userInput.endsWith("?")){
            System.out.println("Sure.");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(userInput.endsWith("!")){
            System.out.println("");
        }else if(userInput.endsWith("")){
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        };
    }
}
