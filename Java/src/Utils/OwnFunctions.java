package Utils;

public class OwnFunctions {
    /**
     * Capitalizes the first letter of each word in a sentence.
     * The method splits the sentence into words, capitalizes the first letter of
     * each word,
     * and ensures the rest of the letters are lowercase.
     * 
     * <p>
     * Words are considered sequences of alphanumeric characters, and punctuation
     * marks are ignored.
     * </p>
     *
     * @param sentence The input sentence whose words will be capitalized.
     * @return String The sentence with each word's first letter capitalized, and
     *         the rest in lowercase.
     */
    public static String capitalizeWords(String sentence) {
        String[] tokens = sentence.split("[^a-zA-Z0-9]+"); // Separamos por cualquier carácter no alfanumérico
        for (String word : tokens) {
            if (!word.isEmpty()) {
                sentence = sentence.replace(word,
                        word.toLowerCase().replace(word.substring(0, 1), word.substring(0, 1).toUpperCase()));
            }
        }
        return sentence;
    }

    /**
     * Capitalizes the first letter of the given string and converts the rest to
     * lowercase.
     * If the string is empty or only contains whitespace, it returns an empty
     * string.
     * 
     * @param sentence The input string to be capitalized.
     * @return String A new string with the first letter capitalized and the rest in
     *         lowercase.
     */
    public static String capitalizeString(String sentence) {
        sentence = sentence.trim();
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase();
    }

}
