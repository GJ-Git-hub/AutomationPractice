package StringPrograms;

public class FindFrequencyOfCharacter {
    public static void main(String args[]) {
        String str = "My name is Jaynat Kale";
        char ch = 'n';
        int freq = 0;

        for (int i = 0; i<str.length(); i++) {
            if (ch == str.charAt(i))
                freq++;
        }
        System.out.println(freq);
    }
}
