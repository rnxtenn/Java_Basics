package Java_Basics;

public class WordCount {

    public static void main(String[] args) {
        countWords("apple banana apple fruit fruit apple hello hi hi hello hi");
    }

    static void countWords(String st) {
        String[] words = st.split("\\s");
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueIndex = 0;

        for (int i = 0; i < words.length; i++) {
            boolean found = false;

            for (int j = 0; j < uniqueIndex; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueIndex] = words[i];
                counts[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }

        int total = 0;
        System.out.println("Words and their count:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(uniqueWords[i] + " = " + counts[i]);
            total += counts[i];
        }

        System.out.println("Total words counted: " + total);
    }
}
