import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("First repeated character: " + firstRepeatedChar(str));
    }
    public static String firstRepeatedChar(String str){
        //the outer loop iterate through the characters in the string
        for(int i = 0; i < str.length(); i++){
            //the inner loop check if current char is repeating
            for(int j = 0; j <i; j++){
                //compare the current char with the previous char
                if(str.charAt(i) == str.charAt(j)){
                    //if match returns the first repeating character as a string
                    return Character.toString(str.charAt(i));
                }
            }
        }
        //if no match, return null
        return null;
    }
}