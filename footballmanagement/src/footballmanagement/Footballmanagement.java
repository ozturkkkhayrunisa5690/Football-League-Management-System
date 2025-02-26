/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class Footballmanagement {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Team teamA = new Team("Team A", 1);
        Team teamB = new Team("Team B", 2);
        Team teamC = new Team("Team C", 3);
        Team teamD = new Team("Team D", 4);
        Team teamE = new Team("Team E", 5);
        Team teamF = new Team("Team F", 6);
        
        Team[] teams = {teamA, teamB, teamC, teamD, teamE, teamF};

        
       Player[] players = {
        new Player("Player 1", 1, "Goalkeeper"),
        new Player("Player 2", 2, "Defender"),
        new Player("Player 3", 3, "Midfielder"),
        new Player("Player 4", 4, "Forward"),
        new Player("Player 5", 5, "Goalkeeper"),
        new Player("Player 6", 6, "Defender"),
        new Player("Player 7", 7, "Midfielder"),
        new Player("Player 8", 8, "Forward"),
        new Player("Player 9", 9, "Goalkeeper"),
        new Player("Player 10", 10, "Defender"),
        new Player("Player 11", 11, "Midfielder"),
        new Player("Player 12", 12, "Forward"),
        new Player("Player 13", 13, "Goalkeeper"),
        new Player("Player 14", 14, "Defender"),
        new Player("Player 15", 15, "Midfielder"),
        new Player("Player 16", 16, "Forward"),
        new Player("Player 17", 17, "Goalkeeper"),
        new Player("Player 18", 18, "Defender")
};
       
       
        for (int i = 0; i < players.length; i++) {
    teams[i % teams.length].addPlayer(players[i]);
}

        
   
        System.out.println("team and players".toUpperCase());
        for (int i = 0; i < 6; i++) {
            System.out.print( teams[i].getTeamName().toUpperCase() + " :");
            System.out.println();
            teams[i].displayPlayers(); 
        }
        
        System.out.println("**********************************");
        
        MatchSimulation simulation = new MatchSimulation(teams.length);
        simulation.scheduleMatches(teams);
        System.out.println("************************");
        
        System.out.println("MATCH RESULTS");
        simulation.simulateMatches();

        System.out.println("************************");
        System.out.println("LEAGUE RANKINGS");
        simulation.printLeagueRankings();
        
        System.out.println("*********************");
        System.out.println("Last three match result ".toUpperCase());
        simulation.retrieveLastNMatches(3);
        
        
        BinarySearchTree teamTree = new BinarySearchTree();
        
        teamTree.insert(teamB);
        teamTree.insert(teamC);
        teamTree.insert(teamD);
        teamTree.insert(teamA);
        teamTree.insert(teamE);
        teamTree.insert(teamF);
        
        System.out.println("********************");
        System.out.println("InOrder Traversal by teams name".toUpperCase());
        teamTree.displayTeams();
        System.out.println("***********");
        
        
        HashTable teamHashTable = new HashTable(10);
        HashTable playerHashTable = new HashTable(10);
        
        
        teamHashTable.add(teamA);
        teamHashTable.add(teamB);
        teamHashTable.add(teamC);
        teamHashTable.add(teamD);
        teamHashTable.add(teamE);
        teamHashTable.add(teamF);


        for (Player player : players) {
            playerHashTable.add(player);
        }
        
        
        System.out.println("Team Hash Table:".toUpperCase());
        teamHashTable.displayHashTable();

        System.out.println("**************");
        System.out.println("Player Hash Table:".toUpperCase());
        playerHashTable.displayHashTable();
        
        
            
    }
}