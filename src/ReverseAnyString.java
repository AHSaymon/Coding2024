import java.util.Scanner;

public class ReverseAnyString {
    public static void main(String[] args) {
       /*v1
        String object="Life";

        */
        String object;
        Scanner input=new Scanner(System.in);
        System.out.println("Write a string");
        object=input.next();

        //Converting string into array
        char[] resultArray=object.toCharArray();

        System.out.println("Reverse string is:");
        for (int i=resultArray.length-1;i>=0;i--){
            System.out.print(resultArray[i]);
            //System.out.print(resultArray[i]);

        }


    }
}
