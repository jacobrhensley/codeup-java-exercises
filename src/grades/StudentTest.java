package grades;

import util.Input;

import java.util.HashMap;

public class StudentTest{

    static Input input = new Input();

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();



        Student Jacob = new Student("Jacob");
        Jacob.addGrade(88);
        Jacob.addGrade(96);
        Jacob.addGrade(100);

        Student Emily = new Student("Emily");
        Emily.addGrade(97);
        Emily.addGrade(93);
        Emily.addGrade(100);

        Student Harley = new Student("Harley");
        Harley.addGrade(88);
        Harley.addGrade(50);
        Harley.addGrade(76);

        Student Ellie = new Student("Ellie");
        Ellie.addGrade(45);
        Ellie.addGrade(70);
        Ellie.addGrade(20);


        students.putIfAbsent("jacobrhensley", Jacob);
        students.putIfAbsent("emghensley", Emily);
        students.putIfAbsent("harhar", Harley);
        students.putIfAbsent("squeeks", Ellie);


        cli(students);
    }


    public static void cli(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{

            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }

            System.out.println("What student would you like to see more information on?\n");
            String typedKey = input.getString();
            if(students.containsKey(typedKey)){

                Student currentStudent = students.get(typedKey);

                System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                + "Current Average: %.2f",
                        currentStudent.getName(),
                        typedKey,
                        currentStudent.getGradeAverage()
                ));
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
            }
            System.out.println("Would you like to see another student?");
        }while(input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");

    }
}
