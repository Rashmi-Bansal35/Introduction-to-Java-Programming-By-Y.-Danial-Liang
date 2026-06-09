/*
ISBN-13 is a new standard for indentifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum, which is calculated from the other digits using the following formula:
        10- (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
If the checksum is 10, replace it with 0. Your program should read the input as a string.
*/

package Chapter5;
import java.util.Scanner;

public class Question47 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13: ");
        String isbn = input.next();

        if (isbn.length() == 12){
            int checksum = 0;
            for (int i = 0; i < 12; i++){
                int number = Character.getNumericValue(isbn.charAt(i));
                if (i % 2 != 0){
                    checksum = checksum + (3 * number);
                }
                else {
                    checksum += number;
                }
            }

            checksum %= 10;
            checksum = 10 - checksum;

            if (checksum == 10){
                System.out.println("The ISBN-13 number is " + isbn + "0");
            }
            else{
                System.out.println("The ISBN-13 number is " + isbn + checksum);
            }
        }
        else{
            System.out.println(isbn + " is an invalid input");
        }
        

        input.close();
    }
}
