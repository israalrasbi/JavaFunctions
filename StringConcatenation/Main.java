import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.print("The concatenated string is: " + minCat(str1, str2));
    }

    public static String minCat(String str1, String str2) {
        //check the length of the words
        int wordOneLength = str1.length();
        int wordTwoLength = str2.length();

        //define a variable to store the concatenated word
        String concatword = "";
        //if they have the same length, then concat directly
        if (wordOneLength == wordTwoLength) {
            concatword = str1 + str2;
            return concatword;
        }
        //else, check which word is longer, then remove the extra char
        //if str1 is bigger than str2, then change str1
        if (wordOneLength > wordTwoLength) {
            //get the difference between the two words
            int diff = wordOneLength - wordTwoLength;
            //define the new str1 after removing the extra char
            String newStr1 = str1.substring(diff,wordOneLength);
            //concat
            concatword = newStr1 + str2;
            return concatword;
        }
        //else, if str2 is bigger than str1, the change str2
        else{
            int diff = wordTwoLength - wordOneLength;
            String newStr2 = str2.substring(diff,wordTwoLength);
            concatword = str1 + newStr2;
            return concatword;
        }
    }
}