/**
 * Checks if a given string is an isogram.
 * An isogram is a word or phrase with no repeating letters.
 * 
 * @param {string} str - The string to check
 * @returns {boolean} true if the string is an isogram, false otherwise
 */
function isIsogram(str) {
    // Convert to lowercase to handle case-insensitive checking
    str = str.toLowerCase();
    
    // Boolean array to track which letters have been seen
    // 26 letters in the alphabet
    const letterSeen = new Array(26).fill(false);
    
    for (let i = 0; i < str.length; i++) {
        const c = str[i];
        
        // Only check alphabetic characters
        if (c >= 'a' && c <= 'z') {
            const index = c.charCodeAt(0) - 'a'.charCodeAt(0); // Map 'a' to 0, 'b' to 1, etc.
            
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

// Test cases
const testWords = [
    "Dermatoglyphics",
    "isogram",
    "moose",
    "aba",
    "thumbscrew",
    "alphabet",
    ""
];

console.log("Isogram Checker using Boolean Array\n");

testWords.forEach(word => {
    const result = isIsogram(word);
    console.log(`"${word}" is ${result ? "an isogram" : "NOT an isogram"}`);
});
