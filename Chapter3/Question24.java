/*
Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
*/

package Chapter3;

public class Question24 {
    public static void main(String[] args){
        // Generate a random number
        int number = (int)(Math.random() * 52) + 1;

        // Detremine the cards rank and suit
        int rank = number % 13;
        int suit = number / 13;

        String cardRank = " ";
        String cardSuit = " ";

        // Assign the rank
        switch (rank){
            case 0:
                cardRank = "Ace";
                break;
            case 1:
                cardRank = "2";
                break;
            case 2:
                cardRank = "3";
                break;
            case 3:
                cardRank = "4";
                break;
            case 4:
                cardRank = "5";
                break;
            case 5:
                cardRank = "6";
                break;
            case 6:
                cardRank = "7";
                break;
            case 7:
                cardRank = "8";
                break;
            case 8:
                cardRank = "9";
                break;
            case 9:
                cardRank = "10";
                break;
            case 10:
                cardRank = "Jack";
                break;
            case 11: 
                cardRank = "Queen";
                break;
            case 12:
                cardRank = "King";
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Assign the value of suit
        switch (suit){
            case 0:
                cardSuit = "Clubs";
                break;
            case 1:
                cardSuit = "Diamonds";
                break;
            case 2:
                cardSuit = "Hearts";
                break;
            case 3:
                cardSuit = "Spades";
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Display the result
        System.out.println("The card you picked is " +cardRank+ " of " +cardSuit);
    }
}
