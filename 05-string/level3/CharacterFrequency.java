import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];   
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                count++;
                freq[ch] = 0;  
            }
        }
        String[][] result = new String[count][2];
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = Character.toString(ch);
                result[index][1] = Integer.toString(freq[ch]);
                freq[ch] = 0;  // mark visited
                index++;
            }
        }
        return result;
    }
    public static void display(String[][] result) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = findFrequency(text);
        display(result);
        sc.close();
    }
}