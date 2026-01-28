/**
 * Checks if a given string is an isogram.
 * An isogram is a word or phrase with no repeating letters.
 * 
 * @param str The string to check
 * @return true if the string is an isogram, false otherwise
 */
fun isIsogram(str: String): Boolean {
    // Convert to lowercase to handle case-insensitive checking
    val lowerStr = str.lowercase()
    
    // Boolean array to track which letters have been seen
    // 26 letters in the alphabet
    val letterSeen = BooleanArray(26)
    
    for (c in lowerStr) {
        // Only check alphabetic characters
        if (c in 'a'..'z') {
            val index = c - 'a' // Map 'a' to 0, 'b' to 1, etc.
            
            // If we've seen this letter before, it's not an isogram
            if (letterSeen[index]) {
                return false
            }
            
            // Mark this letter as seen
            letterSeen[index] = true
        }
    }
    
    return true
}

fun main() {
    // Test cases
    val testWords = arrayOf(
        "Dermatoglyphics",
        "isogram",
        "moose",
        "aba",
        "thumbscrew",
        "alphabet",
        ""
    )
    
    println("Isogram Checker using Boolean Array\n")
    
    for (word in testWords) {
        val result = isIsogram(word)
        println("\"$word\" is ${if (result) "an isogram" else "NOT an isogram"}")
    }
}
