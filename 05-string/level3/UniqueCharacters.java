import java.util.Scanner;
public class UniqueCharacters {
    public static int findLength(String text) {
        char[] arr = text.toCharArray();
        int count = 0;
        for (char c : arr) {
            count++;
        }
        return count;
    }
    public static char[] findUnique(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }
    public static void display(char[] arr) {
        System.out.println("Unique characters:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        char[] result = findUnique(text);
        display(result);
        sc.close();
    }
}