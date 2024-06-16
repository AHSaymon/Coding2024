import java.util.Scanner;

public class CallingAnotherClass {
    public static void main(String[] args) {

        // object of another class
        //CalledClass obj=new CalledClass();
        //obj.simpleMessage();

        Scanner input=new Scanner(System.in);
        CalledClass obj=new CalledClass();
        System.out.println("Enter your Name:");
        String name=input.nextLine();
        obj.inputMessage(name);
    }
}
