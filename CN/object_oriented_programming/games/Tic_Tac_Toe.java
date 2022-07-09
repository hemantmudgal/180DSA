/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-07-2022
 *   Time: 09:43
 *   File: Tic_Tac_Toe.java
 */

package CN.object_oriented_programming.games;

import java.util.Scanner;

public class Tic_Tac_Toe {
    private Player player1, player2;
    private Board board;

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        player1 = takePlayerInput(1);
        player2 = takePlayerInput(2);
        while (player1.getSymbol() == player2.getSymbol()) {
            System.out.println("This symbol is already picked!! Please choose another symbol for continue.");
            char symbol = sc.next().charAt(0);
            player2.setSymbol(symbol);
        }

        board = new Board(player1.getSymbol(), player2.getSymbol());
        boolean isPlayer1Turn = false;
        int status = Board.INCOMPLETE;
        while(status == Board.INCOMPLETE || status == Board.INVALID){
            if (isPlayer1Turn) {
                System.out.println("Player 1 :" + player1.getName() + "'s turn");
                System.out.print("Enter x: ");
                int x = sc.nextInt();
                System.out.print("Enter Y :");
                int y = sc.nextInt();
                status = board.takeMove(player1.getSymbol(), x, y);
                if (status != Board.INVALID) {
                    isPlayer1Turn = false;
                    board.print();
                }else{
                    System.out.println("Invalid Move !! Try again!!");
                }
            } else {
                System.out.println("Player 2 :" + player2.getName() + "'s turn");
                System.out.print("Enter x: ");
                int x = sc.nextInt();
                System.out.print("Enter Y :");
                int y = sc.nextInt();
                status = board.takeMove(player2.getSymbol(), x, y);
                if (status != Board.INVALID) {
                    isPlayer1Turn = true;
                    board.print();
                }else{
                    System.out.println("Invalid Move!! Try again!!");
                }
            }
        }

        if(status == Board.PLAYER_1_WINS){
            System.out.println(player1.getName() + " wins !!");
        }else if(status == Board.PLAYER_2_WINS){
            System.out.println(player2.getName() + " wins !!");
        }else{
            System.out.println("Match Draw !!");
        }
    }

    private Player takePlayerInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player " + num + " Name :");
        String name = sc.nextLine();
        System.out.println("Enter Player " + num + " Symbol : ");
        char symbol = sc.next().charAt(0);
        Player p = new Player(name,symbol);
        return p;
    }


}