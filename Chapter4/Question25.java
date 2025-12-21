/*
Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number.
Like⁡⁢⁢⁣ ⁡⁣⁢⁣𝗟𝗟𝗟𝗗𝗗𝗗𝗗⁡ here, L is letter and D is digit
*/

package Chapter4;

public class Question25 {
    public static void main(String[] args){
        // Generate random letters
        char letter1 = (char) ('A' + (Math.random() * 26));
        char letter2 = (char) ('A' + (Math.random() * 26));
        char letter3 = (char) ('A' + (Math.random() * 26));

        // Generate random digits
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int digit4 = (int) (Math.random() * 10);

        // Display the output
        System.out.println("The generated plate number is " + letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4);
    }
}
