public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Helloooooo, World!");

        int myFavoriteNumber = 48;
        System.out.println(myFavoriteNumber);

        String myString = "This is my string";
        System.out.println(myString);

        long myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        String class = "class string"

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        x = 10;
//        x += 5;
        int y = 2;
//        y *= x;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        x = Integer.MAX_VALUE;
        x++;
        System.out.println("MAXVAL + 1 " + x);
    }
}
