using System;

public class IsogramChecker
{
    /// <summary>
    /// Checks if a given string is an isogram.
    /// An isogram is a word or phrase with no repeating letters.
    /// </summary>
    /// <param name="str">The string to check</param>
    /// <returns>true if the string is an isogram, false otherwise</returns>
    public static bool IsIsogram(string str)
    {
        // Convert to lowercase to handle case-insensitive checking
        str = str.ToLower();
        
        // Boolean array to track which letters have been seen
        // 26 letters in the alphabet
        bool[] letterSeen = new bool[26];
        
        foreach (char c in str)
        {
            // Only check alphabetic characters
            if (c >= 'a' && c <= 'z')
            {
                int index = c - 'a'; // Map 'a' to 0, 'b' to 1, etc.
                
                // If we've seen this letter before, it's not an isogram
                if (letterSeen[index])
                {
                    return false;
                }
                
                // Mark this letter as seen
                letterSeen[index] = true;
            }
        }
        
        return true;
    }
    
    public static void Main(string[] args)
    {
        // Test cases
        string[] testWords = {
            "Dermatoglyphics",
            "isogram",
            "moose",
            "aba",
            "thumbscrew",
            "alphabet",
            ""
        };
        
        Console.WriteLine("Isogram Checker using Boolean Array\n");
        
        foreach (string word in testWords)
        {
            bool result = IsIsogram(word);
            Console.WriteLine($"\"{word}\" is {(result ? "an isogram" : "NOT an isogram")}");
        }
    }
}
