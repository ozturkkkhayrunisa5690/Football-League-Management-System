/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class Player {
    
    
    
    public String playerName;
    public int playerID;
    public String position;
    public int goalsScored;

    
    
    public Player(String playerName, int playerID, String position) {
        this.playerName = playerName;
        this.playerID = playerID;
        this.position = position;
        this.goalsScored = 0;
    }
 
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void updateGoals(int goals) {
        this.goalsScored += goals;
    }

    @Override
    public String toString() {
        return "Player Name: " + playerName + ", ID: " + playerID + ", Position: " + position + ", Goals: " + goalsScored;
    }

}
