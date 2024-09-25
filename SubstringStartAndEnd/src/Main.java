import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("New word: "+without2(str));

    }

    public static String without2(String str) {
        //get the length of the string
        int strLength = str.length();
        //define two variables, one that will store the first two letters, and the second will store the last two letters
        String firstTwoChar = str.substring(0, 2);
        String lastTwoChar = str.substring(strLength-2);
        //check if the string is more than 2 letters
        //and check if the first and last letters match
        if(strLength >= 2 && firstTwoChar.equals(lastTwoChar)) {
            //if yes, then remove the first two char
            return str.substring(2);
        }
        //else, the string is less than 2 letters
        //then, return the string as it is
        return str;
    }
}