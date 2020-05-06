import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add() " + add(8, 2));
        System.out.println("subtract() " + subtract(12, 2));
        System.out.println("multiply() " + multiply(5, 2));
        System.out.println("divide() " + divide(20, 2));
        System.out.println("modulus() " + modulus(21, 2));




        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("factorial test");
            factorial();
            System.out.println("Do you wish to continue? y/n");
            String answer = scan.nextLine();
            if(answer.toLowerCase().equals("n")){
                break;
            }
        }


//        System.out.println("getInteger test");
//        getInteger(1, 10);

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        // how to proceed
        if( userInput < min || userInput > max ){
            System.out.println("Number is outside of the range");
            return getInteger(min, max);
        } else {
            // how to stop
            System.out.println("Number is within the range");
            return userInput;
        }
    }
    public static void factorial(){
        int userInput = getInteger(1,10);
        long sum = 1;
        for (int fa = userInput; fa > 0; fa--){
            sum *= fa;
        }
        System.out.println("factorial of " + userInput +" = " + sum);
    }

}
