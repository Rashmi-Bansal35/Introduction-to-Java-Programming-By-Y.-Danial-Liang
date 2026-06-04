# 🌟 Chapter 4: Mathematical Functions, Characters, and Strings

Welcome to **Chapter 4** of the _Introduction to Java Programming_ by **Y. Daniel Liang**!  
This chapter is your launchpad into the world of Java—one of the most popular and versatile programming languages.

---

## 🚀 What You'll Learn

- 🧮 **Mathematical Functions:**  
  Using Java's Math class for common mathematical operations (e.g., pow, sqrt, sin, cos, random)
- 🔤 **Characters and Unicode:**  
  Working with char data type, Unicode, and character operations
- 🔢 **Character Methods:**  
  Using methods like `Character.isDigit`, `Character.isLetter`, `Character.toUpperCase`, etc.
- 📝 **Strings and String Methods:**  
  Creating and manipulating strings, using methods like `substring`, `indexOf`, `length`, `equals`, and string immutability
- 🔄 **String Conversions:**  
  Converting between strings and numbers, parsing input, and formatting output
- 🏋️ **Practice Problems:**  
  Applying these concepts to solve real-world and mathematical problems

---

## 🗂️ Directory Overview

```text
Chapter4/
├── Question1.java                # Area of circle
├── Question2.java                # Shortest distance between 2 points
├── ...
├── ...
├── ...
├── Question26.java               # Currency Handler
├── GuessBirthday.java
└── Readme.md                     # This documentation file
```

---

# 🛠️ How to Compile & Run Java Programs
If you are using a terminal or command prompt, follow these simple steps to compile and run any Java program.

## 1️⃣ Navigate to the Chapter Folder
```bash
cd chapter4
```

## 2️⃣ Compile the Java File
Before execution, Java source code (`.java`) must be compiled into bytecode (`.class`).
```bash
javac Question1.java
```

## 3️⃣ Run the Compiled Class

While running the program, do not include the `.java` or `.class` extension.
```bash
java Question1
```
---

## 📚 Recommended Reading

- Chapter 4 of _Introduction to Java Programming_ by Y. Daniel Liang

---

## 📝 Questions List

| #  | Exercise Description | Source Code | Status |
|----|----------------------|-------------|--------|
| 01 | Program that reads the radius of a circle, computes its area, and displays the result rounded to two decimal places. | `Question1.java` | ✅ Done |
| 02 | Program that computes the shortest distance between two points on the Earth using latitude and longitude coordinates and the Great Circle formula. | `Question2.java` | ✅ Done |
| 03 | Program that computes the area enclosed by four cities using the Great Circle formula and Heron’s formula. | `Question3.java` | ✅ Done |
| 04 | Program that reads the side length of a regular hexagon and calculates its area. | `Question4.java` | ✅ Done |
| 05 | Program that reads the number of sides and side length of a regular polygon, then computes its area. | `Question5.java` | ✅ Done |
| 06 | Program that generates three random points on a circle and computes the angles of the triangle formed by those points. | `Question6.java` | ✅ Done |
| 07 | Program that displays the coordinates of a pentagon’s vertices given the radius of its bounding circle. | `Question7.java` | ✅ Done |
| 08 | Program that reads an ASCII code (0–127) and displays its corresponding character. | `Question8.java` | ✅ Done |
| 09 | Program that reads a character and displays its Unicode value. | `Question9.java` | ✅ Done |
| 10 | Modify the GuessBirthday program to use `Y/N` input instead of `1/0` for user responses. | `Question10.java` | ✅ Done |
| 11 | Program that converts an integer value (0–15) to its hexadecimal representation. | `Question11.java` | ✅ Done |
| 12 | Program that converts a hexadecimal digit into its corresponding binary representation. | `Question12.java` | ✅ Done |
| 13 | Program that reads a letter and determines whether it is a vowel or a consonant. | `Question13.java` | ✅ Done |
| 14 | Program that converts a letter grade into its corresponding numeric value. | `Question14.java` | ✅ Done |
| 15 | Program that maps a letter to its corresponding telephone keypad number. | `Question15.java` | ✅ Done |
| 16 | Program that displays a randomly generated uppercase letter. | `Question16.java` | ✅ Done |
| 17 | Program that reads a month and year, then displays the number of days in that month, accounting for leap years. | `Question17.java` | ✅ Done |
| 18 | Program that reads two characters representing a student’s major and academic status, then displays the corresponding information. | `Question18.java` | ✅ Done |
| 19 | Program that computes the ISBN-10 check digit from a 9-digit string input and displays the complete ISBN. | `Question19.java` | ✅ Done |
| 20 | Program that reads a string and displays its length and first character. | `Question20.java` | ✅ Done |
| 21 | Program that validates a Social Security number entered in `DDD-DD-DDDD` format. | `Question21.java` | ✅ Done |
| 22 | Program that checks whether one string is a substring of another string. | `Question22.java` | ✅ Done |
| 23 | Program that generates a formatted payroll statement based on employee information and pay details. | `Question23.java` | ✅ Done |
| 24 | Program that reads three city names and displays them in ascending alphabetical order. | `Question24.java` | ✅ Done |
| 25 | Program that generates a random vehicle plate number in `AAA-1234` format. | `Question25.java` | ✅ Done |
| 26 | Modify the ComputeChange program to use string processing for accurate currency handling and change calculation. | `Question26.java` | ✅ Done |


---

# 📚 Recommended Resources for the Methods Chapter

## 📖 Primary Reading
**Chapter 6 of _Introduction to Java Programming_ by Y. Daniel Liang**

This chapter introduces Java methods, including:

- Defining and calling methods
- Passing arguments to methods
- Returning values from methods
- Method overloading
- Scope of variables
- Writing reusable and modular code

A solid understanding of methods is essential before moving on to object-oriented programming.

---

## 🌐 Official Documentation
**Oracle Java Documentation – Methods**

Learn about:

- Method declarations
- Parameters and arguments
- Return types
- Access modifiers
- Static methods

Use the official documentation whenever you need clarification on Java syntax or best practices.

---

## ⚠️ Debugging Help
**GeeksforGeeks: Common Java Method Errors**

Helpful for fixing beginner mistakes such as:

- Missing return statements
- Incorrect method signatures
- Parameter mismatch errors
- Calling non-static methods from static contexts
- Infinite recursion issues

---

# 💡 Pro-Tip for Beginners

Methods help you **avoid repeating code** and make programs easier to maintain.

Always double-check:

- Method name spelling
- Number and type of parameters
- Return type (`void`, `int`, `double`, etc.)
- Matching opening and closing braces `{ }`
- Proper method calls

---

> _"Any code of your own that you haven't looked at for six or more months might as well have been written by someone else."_  
> — Eagleson's Law

Happy Coding! 🎉
