/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class MatchStack {
    
    
    public MatchNode top;

    public void push(Match match) {
        MatchNode newNode = new MatchNode(match);
        newNode.next = top;
        top = newNode;
    }

    public Match pop() {
        if (top == null) return null;
        Match match = top.data;
        top = top.next;
        return match;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void getLastNMatches(int n) {
        if (top == null) {
            System.out.println("No matches available.");
            return;
        }
        MatchNode current = top;
        int count = 0;
        while (current != null && count < n) {
            System.out.println(current.data.getTeam1().getTeamName() + " " + current.data.getScore1() + " - " +
                    current.data.getScore2() + " " + current.data.getTeam2().getTeamName());
            current = current.next;
            count++;
        }
    
}
}
