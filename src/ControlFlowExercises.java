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

        for(byte i = 0; i <= 100; i++){
            boolean check = true;
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }
        }

    }
}
