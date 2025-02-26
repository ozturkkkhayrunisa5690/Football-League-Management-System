/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class Match {
    
    public Team team1, team2;
    public int score1, score2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }


    public void simulate() {
        this.score1 = (int) (Math.random() * 5);
        this.score2 = (int) (Math.random() * 5); 
        updateResults();
    }

    private void updateResults() {
        if (score1 > score2) {
            team1.updatePointsAndGoalDifference(3, score1 - score2);
            team2.updatePointsAndGoalDifference(0, score2 - score1);
        } else if (score2 > score1) {
            team2.updatePointsAndGoalDifference(3, score2 - score1);
            team1.updatePointsAndGoalDifference(0, score1 - score2);
        } else {
            team1.updatePointsAndGoalDifference(1, 0);
            team2.updatePointsAndGoalDifference(1, 0);
        }
    

    }
    
    public void printResult() {
    System.out.println(team1.getTeamName() + ": " + score1 + " - " + score2 + " : " + team2.getTeamName());
}

    public Team getWinner() {
        if (score1 > score2) {
            return team1;
        } else if (score2 > score1) {
            return team2;
        }
        return null;
    }

    public Team getLoser() {
        if (score1 < score2) {
            return team1;
        } else if (score2 < score1) {
            return team2;
        }
        return null;
    }

    public int getWinnerGoalDifference() {
        if (score1 > score2) {
            return score1 - score2;
        } else if (score2 > score1) {
            return score2 - score1;
        }
        return 0;
    }

    public int getLoserGoalDifference() {
        if (score1 < score2) {
            return score2 - score1;
        } else if (score2 < score1) {
            return score1 - score2;
        }
        return 0;
    
}
}
