/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class Team {
    
    
    public String teamName;
    public int teamID;
    public LinkedList playerList;
    public int totalPoints;
    public int goalDifference;
    public int goalsScored;  
    public int goalsConceded;
    

    public Team(String teamName, int teamID) {
        this.teamName = teamName;
        this.teamID = teamID;
        this.playerList = new LinkedList();
        this.totalPoints = 0;
        this.goalDifference = 0;
        this.goalsScored = 0;   
        this.goalsConceded = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public LinkedList getPlayerList() {
        return playerList;
    }

    public void setPlayerList(LinkedList playerList) {
        this.playerList = playerList;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }
    

    public void addPlayer(Player player) {
        playerList.add(player);
    }

   
    public void removePlayer(int playerID) {
        playerList.remove(playerID);
    }

   
    public void updatePlayer(int playerID, String newName, String newPosition, int newGoals) {
        Node playerNode = playerList.find(playerID);
        if (playerNode != null) {
            Player player = playerNode.data;
            player.playerName = newName;
            player.position = newPosition;
            player.goalsScored = newGoals;
            System.out.println("Player updated successfully.");
        } else {
            System.out.println("Player not found.");
        }
    }

   
    public void displayPlayers() {
        
        Node current = playerList.head;  
        
        while (current != null) {
        Player player = current.data;  
        System.out.println(" Name: " + player.playerName + "  Position: " + player.position);
        current = current.next; 
    }
        
    }
    
    public void updatePointsAndGoalDifference(int points, int goalDiff) {
        this.totalPoints += points;
        this.goalDifference += goalDiff;
    }
    
     @Override
    public String toString() {
        return teamName + ": " + totalPoints + " Points" + "  Goal Difference: " + goalDifference;
    }
    

}
