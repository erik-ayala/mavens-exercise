import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println("Is this a number: "+org.apache.commons.lang3.StringUtils.isNumeric(userInput));
        System.out.println(org.apache.commons.lang3.StringUtils.swapCase(userInput));
        System.out.println(org.apache.commons.lang3.StringUtils.reverse(userInput));
    }
}
