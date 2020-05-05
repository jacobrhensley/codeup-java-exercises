import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//
//        while(i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println("i is " + i);
//            i = i * i;
//        } while (i <= 1000000);


//for(int i = 100; i>= -10; i -= 5){
////    System.out.println("i is " + i);
////}

//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println("i is " + i);
//        }

//        for(byte i = 0; i <= 100; i++){
//            boolean check = true;
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//        }

//        Scanner input = new Scanner((System.in));
//
//
//        System.out.println("Please enter a number");
//        int number = input.nextInt();
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for(int i = 0; i <= number; i++){
//
//            System.out.println(number+"      |"+ i * i +"        |"+ i * i * i+"     ");
//        }



        Scanner scanner = new Scanner(System.in);

        boolean anotherGrade = true;

        do {
            System.out.print("Please enter a numerical grade from 0 to 100 ");

            int numericGrade = scanner.nextInt();

            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Do you wish to enter a new grade? ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }
        } while (anotherGrade);
    }
}
