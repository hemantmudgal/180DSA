/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-07-2022
 *   Time: 09:43
 *   File: Board.java
 */

package CN.object_oriented_programming.games.tictactoe;

public class Board {
    private char[][] board;
    private int boardSize = 3;
    private char symbol1, symbol2;
    private int count;
    public final static int PLAYER_1_WINS = 1;
    public final static int PLAYER_2_WINS = 2;
    public final static int DRAW = 3;
    public final static int INCOMPLETE = 4;
    public final static int INVALID = 5;

    public Board(char symbol1, char symbol2){
        board = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = ' ';
            }
        }
        setSymbol1(this.symbol1);
        setSymbol2(this.symbol2);
    }

    public char getSymbol1(){
        return this.symbol1;
    }

    public char getSymbol2(){
        return this.symbol2;
    }

    public void setSymbol1(char symbol1){
        if(symbol1 != '\0'){
            this.symbol1 = symbol1;
        }
    }

    public void setSymbol2(char symbol2){
        if(symbol2 != '\0'){
            this.symbol2 = symbol2;
        }
    }

    public int takeMove(char symbol, int x, int y){

        if(x < 0 || x > boardSize - 1 || y < 0 || y > boardSize - 1 || board[x][y] != ' '){
            return INVALID;
        }

        board[x][y] = symbol;
        count++;

        //Check Row
        if(board[x][0] == board[x][1] && board[x][0] == board[x][2]){
            return symbol == symbol1 ? PLAYER_1_WINS : PLAYER_2_WINS;
        }

        // Check Column
        if(board[0][y] == board[1][y] && board[2][y] == board[0][y]){
            return symbol == symbol1 ? PLAYER_1_WINS : PLAYER_2_WINS;
        }

        //Check First Diagonal
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[2][2] == board[0][0]){
            return symbol == symbol1 ? PLAYER_1_WINS : PLAYER_2_WINS;
        }

        //Check Second Diagonal
        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            return symbol == symbol1 ? PLAYER_1_WINS : PLAYER_2_WINS;
        }

        if(count == boardSize * boardSize){
            return DRAW;
        }

        return INCOMPLETE;
    }

    public void print() {
        System.out.println("======================");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("========================");
    }
}