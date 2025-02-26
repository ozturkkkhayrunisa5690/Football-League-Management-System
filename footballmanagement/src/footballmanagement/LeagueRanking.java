/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class LeagueRanking {
   
    
   public TeamHeap teamHeap;

    public LeagueRanking(int capacity) {
        teamHeap = new TeamHeap(capacity);
    }

  
    public void updateRankings(Team winner, Team loser, int winnerGoalDifference, int loserGoalDifference) {
        if (winner != null) {
            teamHeap.insert(winner);
        }
        if (loser != null) {
            teamHeap.insert(loser);
        }
    }

    public void printLeagueRankings() {
        teamHeap.printHeap();
    }
    
    
  
    
}


  