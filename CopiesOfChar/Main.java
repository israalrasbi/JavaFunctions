import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("The copied characters: "+extraFront(str));

    }

    public static String extraFront(String str) {
        //check the length of the word
        int wordLen = str.length();
        //define a variable that will store copied char
        String copiedChar = " ";
        //if less than 2 then make 3 copies of that 1 char
        if (wordLen < 2) {
            copiedChar = str+str+str; //concatenate
            return copiedChar;
        }
        //else, subtract the first 2 char from the word and make copies
        String first2Char = str.substring(0, 2);
        copiedChar = first2Char+first2Char+first2Char; //concatenate
        return copiedChar;
    }
}