import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a substring: ");
        String substr = sc.nextLine();
        System.out.println("Number of occurrences: "+countOccurrences(str, substr));
    }

    public static int countOccurrences(String str, String substr) {
        //first, define a pattern to be used in the search
        Pattern pattern = Pattern.compile(substr, Pattern.CASE_INSENSITIVE); //what I am looking for
        //second, define a matcher to search for the pattern
        Matcher matcher = pattern.matcher(str); //where I am looking

        int count = 0;
        //loop to  find the next occurrence of the pattern
        while (matcher.find()) {
            count++; //increment the count
        }
        //return the count
        return count;
    }
}