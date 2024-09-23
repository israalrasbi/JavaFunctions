import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        System.out.println("The most frequent character is: " + mostFrequentChar(word));
    }
    public static char mostFrequentChar(String str){
        int maxCount = 0;
        char mostFrequent = ' ';

        //Outer loop iterate through the characters in the string
        for (int i = 0; i < str.length(); i++) {
            int count = 0; //this count will keep track of the number of occurrences

            //inner loop will count occurrences of current char
            for (int j = 0; j < str.length(); j++) {
                //compare the current char with the previous char
                //if match increment the count
                if (str.charAt(j) ==  str.charAt(i)) {
                    count++;
                }
            }

            //if the current character count is greater than the maxCount then change the max
            if (count > maxCount) {
                maxCount = count;
                mostFrequent =  str.charAt(i);
            }
        }

        return mostFrequent;
    }

}