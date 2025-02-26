/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class MatchSimulation {

    
    public MatchQueue schedule;
    public MatchStack results;
    public LeagueRanking leagueRanking;

    
    public MatchSimulation(int teamCount) {
        schedule = new MatchQueue();
        results = new MatchStack();
        leagueRanking = new LeagueRanking(teamCount); 
    }

    
    public void scheduleMatches(Team[] teams) {
        int matchcounter = 1;
        System.out.println("MATCH SCHEDULE");
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                schedule.enqueue(new Match(teams[i], teams[j]));
                char teamChar1 = (char) ('A' + i);
                char teamChar2 = (char) ('A' + j);
                System.out.print(matchcounter + ". MATCH : ");
                matchcounter++;
                System.out.println("TEAM " + teamChar1 + " vs " + "TEAM " + teamChar2);
            }
        }
    }

    public void simulateMatches() {
        while (!schedule.isEmpty()) {
            Match match = schedule.dequeue();
            match.simulate();
            results.push(match);
            match.printResult();

           
            Team winner = match.getWinner();
            Team loser = match.getLoser();
            int winnerGoalDifference = match.getScore1() - match.getScore2();
            int loserGoalDifference = match.getScore2() - match.getScore1();
            leagueRanking.updateRankings(winner, loser, winnerGoalDifference, loserGoalDifference);
        }
  
    
}
    
    public void printLeagueRankings() {
        leagueRanking.printLeagueRankings();
    }

    public void retrieveLastNMatches(int n) {
        if (results == null) {
            System.out.println("No results available.");
            return;
        }
        results.getLastNMatches(n);
    }
}