/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-07-2022
 *   Time: 09:43
 *   File: Players.java
 */

package CN.object_oriented_programming.games;

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }

    public String getName(){
        return this.name;
    }

    public char getSymbol(){
        return this.symbol;
    }

    public void setName(String name){
        if(!(name.isEmpty())){
            this.name = name;
        }
    }

    public void setSymbol(char symbol){
        if(symbol != '\0'){
            this.symbol = symbol;
        }
    }
}