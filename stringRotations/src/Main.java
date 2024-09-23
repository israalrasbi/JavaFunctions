import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:  ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.print("Are they rotation?: " + areRotations(str1, str2));
    }
    public static boolean areRotations(String str1, String str2){
        /*
        Example
        str1 = “ABACD”, str2 = “CDABA”
        temp = str1.str1 = “ABACDABACD”
        str2 is substring of str1
         */
        String temp = str1+str1; //concatenate str1 and str1
        //the size of the strings should be the same
        //str2 should be a substring of str1
        return (str1.length() == str2.length()) && (temp.indexOf(str2) != -1);
    }
}