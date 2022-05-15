import java.util.*;

class ConnectFourGame {

    public static void playGame(Player playerA, Player playerB, Board board) {
        int colChoice;
        Player winner = null;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println();
            board.showBoard();
            System.out.println();

            System.out.println(playerA.getUsername() + " 's turn: " + playerA.getColor());
            System.out.print("Select a column (1 - 8): ");
            colChoice = scanner.nextInt();
            board.pushMove(playerA.getColor(), colChoice);

            if (board.getResult() != 0) {
                if (board.getResult() == 1)
                    winner = playerA;
                break;
            }
            
            System.out.println();
            board.showBoard();
            System.out.println();

            System.out.println(playerB.getUsername() + " 's turn: " + playerB.getColor());
            System.out.print("Select a column (1 - 8): ");
            colChoice = scanner.nextInt();
            board.pushMove(playerB.getColor(), colChoice);

            if (board.getResult() != 0) {
                if (board.getResult() == 1)
                    winner = playerA;
                break;
            }
        }
        scanner.close();

        System.out.println();
        board.showBoard();
        System.out.println();

        if (winner != null) {
            System.out.println("CONGRATULATIONS " + winner.getUsername() + "(" + winner.getColor() + ")!");
            System.out.println("YOU HAVE WON THE CONNECT 4 GAME!");
        }
        else {
            System.out.println("GAME DRAW!\n" + playerA.getUsername() + " and " + playerB.getUsername() + " have player for a draw.");
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE CONNECT 4 GAME\n");
        
        board.showBoard();

        Player player1 = new Player();
        System.out.println("\nPLAYER 1:");
        System.out.print("Username: ");
        player1.setUsername(scanner.nextLine());
        System.out.print("Color (R/B): ");
        player1.setColor(scanner.nextLine().charAt(0));

        Player player2 = new Player();
        System.out.println("\nPLAYER 2:");
        System.out.print("Username: ");
        player2.setUsername(scanner.nextLine());
        if (player1.getColor() == 'R') {
            player2.setColor('B');
        }
        else {
            player2.setColor('R');
        }
        System.out.println("Color (R/B): " + player2.getColor());

        System.out.println("--------------------------------------------------------");
        
        System.out.println();
        System.out.println("TOSS: 0: " + player1.getUsername() + " | 1: " + player2.getUsername());
        System.out.print("Enter \'p\' to proceed: ");
        while(true) {
            if (scanner.nextLine().charAt(0) == 'p') break;
        }

        System.out.println();
        int toss = new Random().nextInt(2);
        if (toss == 0) {
            System.out.println(player1.getUsername() + " to move first.");
            playGame(player1, player2, board);
        }
        else {
            System.out.println(player2.getUsername() + " to move first.");
            playGame(player2, player1, board);
        }
        
        scanner.close();
    }
}