### This repository contains the solution for six tasks in java, covering functions

**Task1: longest word in a sentence**

Write a method longestWord(String sentence) that returns the longest word in a given sentence. If there are multiple words with the same length, return the first one.

Example Input: "The quick brown fox jumped over the lazy dog"

Example Output: "jumped"

**Task2: Count the Occurrences of a substring**

Write a method countOccurrences(String str, String substr) that counts how many times substr appears in str.

Example Input: "banana", "ana"

Example Output: 1

**Task3: Remove a specific character**

Write a method removeCharacter(String str, char ch) that removes all occurrences of a given character ch from the string.

Example Input: "hello world", 'l'

Example Output: "heo word"

**Task4: Check if two strings are rotations**

Write a method areRotations(String str1, String str2) that checks if str2 is a rotation of str1.

Example Input: "abcd", "dabc"

Example Output: true

**Task5: Find the Most Frequent Character**

Write a method mostFrequentChar(String str) that returns the character that appears most frequently in the string. If there are multiple characters with the same frequency, return any of them.

Example Input: "success"

Example Output: 's'

**Task6: Find the First Repeated Character**

Write a method firstRepeatedChar(String str) that returns the first character that is repeated in the string. If no character is repeated, return null.

Example Input: "swiss"

Example Output: 's'

**Task7: String Concatenation**

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"`

minCat("Hello", "java") → "ellojava" `

minCat("java", "Hello") → "javaello"

**Task8: 3 copies of first 2 characters**

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"`

extraFront("ab") → "ababab" `

extraFront("H") → "HHH"

**Task9: Substring begin and end**
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"`

without2("HelloHi") → "HelloHi" `

without2("Hi") → ""

