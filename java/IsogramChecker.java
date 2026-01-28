public class IsogramChecker {
    
    /**
     * Checks if a given string is an isogram.
     * An isogram is a word or phrase with no repeating letters.
     * 
     * @param str The string to check
     * @return true if the string is an isogram, false otherwise
     */
    public static boolean isIsogram(String str) {
        // Convert to lowercase to handle case-insensitive checking
        str = str.toLowerCase();
        
        // Boolean array to track which letters have been seen
        // 26 letters in the alphabet
        boolean[] letterSeen = new boolean[26];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Only check alphabetic characters
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a'; // Map 'a' to 0, 'b' to 1, etc.
                
                // If we've seen this letter before, it's not an isogram
                if (letterSeen[index]) {
                    return false;
                }
                
                // Mark this letter as seen
                letterSeen[index] = true;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Test cases
        String[] testWords = {
            "Dermatoglyphics",
            "isogram",
            "moose",
            "aba",
            "thumbscrew",
            "alphabet",
            ""
        };
        
        System.out.println("Isogram Checker using Boolean Array\n");
        
        for (String word : testWords) {
            boolean result = isIsogram(word);
            System.out.println("\"" + word + "\" is " + 
                             (result ? "an isogram" : "NOT an isogram"));
        }
    }
}
