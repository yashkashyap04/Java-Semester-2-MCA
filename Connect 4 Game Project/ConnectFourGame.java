import java.util.Scanner;

class ConnectFourGame {

    public static void playGame() {
        
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
        
        scanner.close();
    }
}