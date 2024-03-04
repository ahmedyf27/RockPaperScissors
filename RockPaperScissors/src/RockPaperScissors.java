import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain;
        //starts do-while loop in order to keep multiple games going
        do {

            char moveA, moveB; //Contains the core game, with both move A and move B
            do {
                System.out.print("Player A, enter your move (R/P/S): ");
                moveA = scanner.next().charAt(0); //Stores move
            } while (moveA != 'R' && moveA != 'P' && moveA != 'S' && moveA != 'r' && moveA != 'p' && moveA != 's'); //ensures proper command before moving on

            do {
                System.out.print("Player B, enter your move (R/P/S): ");
                moveB = scanner.next().charAt(0);
            } while (moveB != 'R' && moveB != 'P' && moveB != 'S' && moveB != 'r' && moveB != 'p' && moveB != 's');

            if (moveA == moveB) {
                System.out.println("It's a Tie!"); //Declaration section for winner/loser/tie
            } else if ((moveA == 'R' && moveB == 'S') || (moveA == 'P' && moveB == 'R') || (moveA == 'S' && moveB == 'P')) {
                System.out.println("Player A wins! " + getResultPhrase(moveA, moveB));
            } else {
                System.out.println("Player B wins! " + getResultPhrase(moveB, moveA));
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y'); //emd of do-while loop, reinitiates game if correct value is inputted

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static String getResultPhrase(char winner, char loser) { //explanation of victory section
        if (winner == 'R' && loser == 'S') {
            return "Rock breaks Scissors";
        } else if (winner == 'P' && loser == 'R') {
            return "Paper covers Rock";
        } else if (winner == 'S' && loser == 'P') {
            return "Scissors cuts Paper";
        }
        return "";
    }
}