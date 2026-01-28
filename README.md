# Isogram Checker - One Array Solution

## 📖 Problem Description

An **isogram** is a word or phrase that has no repeating letters. Each letter appears at most once. For example:
- ✅ "Dermatoglyphics" - is an isogram (no repeating letters)
- ✅ "isogram" - is an isogram
- ❌ "moose" - NOT an isogram (letter 'o' repeats)
- ❌ "aba" - NOT an isogram (letter 'a' repeats)

The challenge is to write a program that determines whether a given string is an isogram or not, using **only one array** as the data structure.

## 💡 Solution Approach - Array of Booleans

This implementation uses a **boolean array** to efficiently check for repeated letters:

### Algorithm Explanation:

1. **Initialize a Boolean Array**: Create an array of 26 boolean values (one for each letter in the English alphabet), all initially set to `false`.

2. **Convert to Lowercase**: Process the input string in lowercase to ensure case-insensitive checking (e.g., 'A' and 'a' are treated as the same letter).

3. **Iterate Through Each Character**:
   - For each alphabetic character in the string:
     - Calculate its index (0-25) by subtracting the ASCII value of 'a' from the character
     - **Check if already seen**: If `letterSeen[index]` is `true`, we've encountered this letter before → return `false` (not an isogram)
     - **Mark as seen**: Set `letterSeen[index] = true` to record that we've seen this letter

4. **Return Result**: If we complete the loop without finding duplicates → return `true` (is an isogram)

### Why This Approach?

- **Time Complexity**: O(n) - We only need to traverse the string once
- **Space Complexity**: O(1) - The boolean array always has a fixed size of 26, regardless of input size
- **Efficiency**: Using an array with direct indexing is faster than other approaches like nested loops or sorting
- **Simplicity**: The boolean array clearly represents "seen/not seen" state for each letter

## 🚀 Implementations

This repository contains isogram checker implementations in **6 programming languages**:

### 1. Java
```bash
cd java
javac IsogramChecker.java
java IsogramChecker
```

### 2. Python
```bash
cd python
python isogram_checker.py
```

### 3. C
```bash
cd c
gcc isogram_checker.c -o isogram_checker
./isogram_checker
```

### 4. C#
```bash
cd csharp
csc IsogramChecker.cs
mono IsogramChecker.exe  # On Linux/Mac
# OR
IsogramChecker.exe       # On Windows
```

### 5. Kotlin
```bash
cd kotlin
kotlinc IsogramChecker.kt -include-runtime -d IsogramChecker.jar
java -jar IsogramChecker.jar
```

### 6. JavaScript
```bash
cd javascript
node isogramChecker.js
```

## 📁 Project Structure

```
Isogram-one-array/
├── java/
│   └── IsogramChecker.java
├── python/
│   └── isogram_checker.py
├── c/
│   └── isogram_checker.c
├── csharp/
│   └── IsogramChecker.cs
├── kotlin/
│   └── IsogramChecker.kt
├── javascript/
│   └── isogramChecker.js
└── README.md
```

## 📝 Example Output

```
Isogram Checker using Boolean Array

"Dermatoglyphics" is an isogram
"isogram" is an isogram
"moose" is NOT an isogram
"aba" is NOT an isogram
"thumbscrew" is an isogram
"alphabet" is NOT an isogram
"" is an isogram
```

## 🔍 Key Features

- ✅ Case-insensitive checking
- ✅ Handles non-alphabetic characters (spaces, hyphens, etc.) by ignoring them
- ✅ Efficient single-pass algorithm
- ✅ Uses only ONE array data structure
- ✅ Consistent implementation across all languages

## 🎓 Learning Points

This project demonstrates:
- Array manipulation and indexing
- Character-to-index mapping using ASCII values
- Boolean logic for state tracking
- Cross-language programming patterns
- Efficient algorithm design with optimal time and space complexity

## 📱 Connect With Me

Want to see more coding tutorials and projects?

- **Instagram**: [@lacopydepastel](https://www.instagram.com/lacopydepastel)
- **YouTube**: [@rvorine](https://www.youtube.com/@rvorine)

Follow for more programming content, tutorials, and coding challenges!

## 📄 License

Feel free to use this code for learning and educational purposes.

---

⭐ If you found this helpful, please star this repository!