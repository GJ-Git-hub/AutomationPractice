package StringPrograms;
/*
This program provide return in Lexicographical(Dictionary) order means based on Unicode value
using compareTo method
 */
public class StrigStortingInStringArray {
    public static void main(String args[]) {
        String[] words = {"Ruby", "C", "Python", "Java","HtmlCSS"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);

        }

    }
}
