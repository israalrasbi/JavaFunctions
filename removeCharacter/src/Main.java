import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Enter a character to be removed from the string:");
        char ch = sc.next().charAt(0);
        System.out.println("new string: "+removeCharacter(str, ch));
    }

    public static String removeCharacter(String str, char ch){
        //convert char into string
        String newString = String.valueOf(ch);
        //use the replace method
        return str.replace(newString, "");
    }
}