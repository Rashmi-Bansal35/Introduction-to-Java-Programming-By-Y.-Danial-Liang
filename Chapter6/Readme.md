# 🌟 Chapter 6: Methods

Welcome to **Chapter 6** of the _Introduction to Java Programming_ by **Y. Daniel Liang**!  
This chapter focuses on **methods**, one of the most important concepts in Java for writing reusable, organized, and maintainable code.

---

## 🚀 What You'll Learn

- 🔧 **Defining Methods:**  
  Learn how to create methods to perform specific tasks and improve code organization.
- 📞 **Calling Methods:**  
  Understand how to invoke methods from different parts of a program.
- 📥 **Parameters and Arguments:**  
  Pass values into methods to make them flexible and reusable.
- 📤 **Returning Values:**  
  Use return statements to send results back to the calling code.
- 🔄 **Method Overloading:**  
  Create multiple methods with the same name but different parameter lists.
- 🎯 **Scope of Variables:**  
  Learn the difference between local variables, parameters, and variable visibility.
- 🧩 **Code Reusability:**  
  Break large programs into smaller, manageable methods that can be reused throughout your application.
- 🧠 **Problem Solving with Methods:**  
  Use methods to simplify complex calculations, validations, and program logic.

---

## 💡 Why Methods Matter

Methods help you:
- Reduce code duplication
- Improve readability
- Simplify debugging
- Make programs easier to maintain
- Build modular and professional applications

By mastering methods, you'll be able to write cleaner programs and prepare yourself for advanced topics such as **objects, classes, and object-oriented programming**.

---

## 🗂️ Directory Overview

```
Chapter5/
├── Question1.java                # Count positives, negatives, total & average
├── Question2.java                # Addition quiz with score and test time
├── Question3.java                # Kilograms to pounds conversion table
├── ...
├── ...
├── ...
├── Question50.java               # Count uppercase letters
├── Question39.java
├── PrimeNumberMethod.java
└── Readme.md                     # This documentation file
```

---

# 🛠️ How to Compile & Run Java Programs
If you are using a terminal or command prompt, follow these simple steps to compile and run any Java program.

## 1️⃣ Navigate to the Chapter Folder
```bash
cd chapter6
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

- Chapter 6 of _Introduction to Java Programming_ by Y. Daniel Liang

---

## 📝 Questions List

# Chapter 6 Exercises

| #  | Exercise Description | Source Code | Status |
|----|----------------------|-------------|--------|
| 01 | Program that displays the first 100 pentagonal numbers using the method `getPentagonalNumber(int n)`. | `Question1.java` | ✅ Done |
| 02 | Program that computes the sum of the digits in an integer using the method `sumDigits(long n)`. | `Question2.java` | ✅ Done |
| 03 | Program that reverses an integer and determines whether it is a palindrome using the methods `reverse(int)` and `isPalindrome(int)`. | `Question3.java` | ✅ Done |
| 04 | Program that displays an integer in reverse order using the method `reverse(int number)`. | `Question4.java` | ✅ Done |
| 05 | Program that displays three numbers in increasing order using the method `displaySortedNumbers(double num1, double num2, double num3)`. | `Question5.java` | ✅ Done |
| 06 | Program that displays a number pattern using the method `displayPattern(int n)`. | `Question6.java` | ✅ Done |
| 07 | Program that computes future investment values and displays a table for years 1 through 30 using the method `futureInvestmentValue(...)`. | `Question7.java` | ✅ Done |
| 08 | Program that converts between Celsius and Fahrenheit and displays conversion tables using methods for both conversions. | `Question8.java` | ✅ Done |
| 09 | Program that converts between feet and meters and displays conversion tables using methods for both conversions. | `Question9.java` | ✅ Done |
| 10 | Program that uses the `isPrime(int number)` method to find the number of prime numbers less than 10,000. | `Question10.java` | ✅ Done |
| 11 | Exercise description pending. | `Question11.java` | ⏳ Pending |
| 12 | Exercise description pending. | `Question12.java` | ⏳ Pending |
| 13 | Exercise description pending. | `Question13.java` | ⏳ Pending |
| 14 | Exercise description pending. | `Question14.java` | ⏳ Pending |
| 15 | Exercise description pending. | `Question15.java` | ⏳ Pending |
| 16 | Exercise description pending. | `Question16.java` | ⏳ Pending |
| 17 | Exercise description pending. | `Question17.java` | ⏳ Pending |
| 18 | Exercise description pending. | `Question18.java` | ⏳ Pending |
| 19 | Exercise description pending. | `Question19.java` | ⏳ Pending |
| 20 | Exercise description pending. | `Question20.java` | ⏳ Pending |
| 21 | Exercise description pending. | `Question21.java` | ⏳ Pending |
| 22 | Exercise description pending. | `Question22.java` | ⏳ Pending |
| 23 | Exercise description pending. | `Question23.java` | ⏳ Pending |
| 24 | Exercise description pending. | `Question24.java` | ⏳ Pending |
| 25 | Exercise description pending. | `Question25.java` | ⏳ Pending |
| 26 | Exercise description pending. | `Question26.java` | ⏳ Pending |
| 27 | Exercise description pending. | `Question27.java` | ⏳ Pending |
| 28 | Exercise description pending. | `Question28.java` | ⏳ Pending |
| 29 | Exercise description pending. | `Question29.java` | ⏳ Pending |
| 30 | Exercise description pending. | `Question30.java` | ⏳ Pending |
| 31 | Exercise description pending. | `Question31.java` | ⏳ Pending |
| 32 | Exercise description pending. | `Question32.java` | ⏳ Pending |
| 33 | Exercise description pending. | `Question33.java` | ⏳ Pending |
| 34 | Exercise description pending. | `Question34.java` | ⏳ Pending |
| 35 | Exercise description pending. | `Question35.java` | ⏳ Pending |
| 36 | Exercise description pending. | `Question36.java` | ⏳ Pending |
| 37 | Exercise description pending. | `Question37.java` | ⏳ Pending |
| 38 | Exercise description pending. | `Question38.java` | ⏳ Pending |
| 39 | Exercise description pending. | `Question39.java` | ⏳ Pending |

---

# 📚 Recommended Resources for Chapter 6 – Methods

## 📖 Primary Reading
**Chapter 6 of _Introduction to Java Programming_ by Y. Daniel Liang**

This chapter focuses on **methods**, one of the most important concepts in Java for creating reusable, modular, and well-structured programs.

Topics covered include:

- Method definition and invocation
- Parameters and arguments
- Returning values from methods
- Method overloading
- Passing data to methods
- Variable scope and lifetime
- Writing reusable and modular code

A strong understanding of methods is essential because they help break large problems into smaller, manageable tasks.

---

## 🌐 Official Documentation
**Oracle Java Documentation – Methods**

Learn about:

- Method declarations
- Parameters and arguments
- Return types
- Method overloading
- Static methods
- Variable scope

Use the official documentation whenever you need clarification on Java syntax, method design, or best practices.

---

## ⚠️ Debugging Help
**GeeksforGeeks: Common Java Method Errors**

Helpful for fixing beginner mistakes such as:

- Missing return statements
- Incorrect method signatures
- Parameter mismatch errors
- Calling methods with wrong arguments
- Static vs non-static method confusion
- Infinite recursion issues

---

# 💡 Pro-Tip for Beginners

Methods help you write code once and reuse it multiple times throughout your program.
Always double-check:
- Method name spelling
- Return type (`void`, `int`, `double`, etc.)
- Number and type of parameters
- Correct method calls
- Proper placement of braces `{ }`
- Return statements where required

---

> _Life is too short to write messy code or stress over uncompiled days. Just remember: you are the public class of your own life, you hold the main method, and you have the power to define the parameters of your own happiness.
> Whenever things get overwhelming, just treat it like an overstuffed block of code—take a breath, modularize your worries, and throw a break statement into the stress. Write your script with a smile, keep your logic light, and may your days always compile smoothly on the very first try with zero errors!_

Happy Coding! 🎉