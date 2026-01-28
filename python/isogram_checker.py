def is_isogram(string):
    """
    Checks if a given string is an isogram.
    An isogram is a word or phrase with no repeating letters.
    
    Args:
        string: The string to check
    
    Returns:
        True if the string is an isogram, False otherwise
    """
    # Convert to lowercase to handle case-insensitive checking
    string = string.lower()
    
    # Boolean array to track which letters have been seen
    # 26 letters in the alphabet
    letter_seen = [False] * 26
    
    for char in string:
        # Only check alphabetic characters
        if char.isalpha():
            # Map 'a' to 0, 'b' to 1, etc.
            index = ord(char) - ord('a')
            
            # If we've seen this letter before, it's not an isogram
            if letter_seen[index]:
                return False
            
            # Mark this letter as seen
            letter_seen[index] = True
    
    return True


if __name__ == "__main__":
    # Test cases
    test_words = [
        "Dermatoglyphics",
        "isogram",
        "moose",
        "aba",
        "thumbscrew",
        "alphabet",
        ""
    ]
    
    print("Isogram Checker using Boolean Array\n")
    
    for word in test_words:
        result = is_isogram(word)
        print(f'"{word}" is {"an isogram" if result else "NOT an isogram"}')
