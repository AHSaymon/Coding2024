import java.util.Scanner;

public class basicSumWithScannerClass {
    public static void main(String[] args) {
        int firstDigit, secondDigit, result;
        Scanner input=new Scanner(System.in);
        System.out.println("First digit is:");
        firstDigit=input.nextInt();
        System.out.println("Second digit is:");
        secondDigit=input.nextInt();
        result=firstDigit+secondDigit;
        System.out.println("So the result of two digits are:"+result);

    }
}
