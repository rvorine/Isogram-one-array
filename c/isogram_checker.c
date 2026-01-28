#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

/**
 * Checks if a given string is an isogram.
 * An isogram is a word or phrase with no repeating letters.
 * 
 * @param str The string to check
 * @return true if the string is an isogram, false otherwise
 */
bool is_isogram(const char *str) {
    // Boolean array to track which letters have been seen
    // 26 letters in the alphabet
    bool letter_seen[26] = {false};
    
    for (int i = 0; str[i] != '\0'; i++) {
        // Convert to lowercase for case-insensitive checking
        char c = tolower(str[i]);
        
        // Only check alphabetic characters
        if (c >= 'a' && c <= 'z') {
            int index = c - 'a'; // Map 'a' to 0, 'b' to 1, etc.
            
            // If we've seen this letter before, it's not an isogram
            if (letter_seen[index]) {
                return false;
            }
            
            // Mark this letter as seen
            letter_seen[index] = true;
        }
    }
    
    return true;
}

int main() {
    // Test cases
    const char *test_words[] = {
        "Dermatoglyphics",
        "isogram",
        "moose",
        "aba",
        "thumbscrew",
        "alphabet",
        ""
    };
    
    int num_tests = sizeof(test_words) / sizeof(test_words[0]);
    
    printf("Isogram Checker using Boolean Array\n\n");
    
    for (int i = 0; i < num_tests; i++) {
        bool result = is_isogram(test_words[i]);
        printf("\"%s\" is %s\n", test_words[i], 
               result ? "an isogram" : "NOT an isogram");
    }
    
    return 0;
}
