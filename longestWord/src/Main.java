import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to get the maximum word: ");
        String str = sc.nextLine();
        //save the results of the function in a variable
        String maxWord = longestWord(str);
        //print the result
        System.out.println("Longest word is: " + maxWord);

    }

    public static String longestWord(String sentence){
        //split the sentence into words, store them into an array
        String[] words = sentence.split(" ");
        String maxWord = "";
        //loop through the list to get the length of the words
        for(int i=0; i<words.length; i++){
            //check the longest word
            if(words[i].length() >= maxWord.length()){
                maxWord = words[i];
            }
        }
        //return the longest word
        return maxWord;
    }
}