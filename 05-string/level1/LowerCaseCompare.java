import java.util.Scanner;
public class LowerCaseCompare {
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);   
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String inputText = sc.nextLine();   
        String myLower = convertToLower(inputText);
        String builtInLower = inputText.toLowerCase();
        boolean result = compareStrings(myLower, builtInLower);
        System.out.println("Lowercase using user-defined method: " + myLower);
        System.out.println("Lowercase using built-in method: " + builtInLower);
        System.out.println("Are both results same? " + result);
        sc.close();
    }
}
