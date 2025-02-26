/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class MatchQueue {
    
    
    public MatchNode front, rear;

    public void enqueue(Match match) {
        MatchNode newNode = new MatchNode(match);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Match dequeue() {
        if (front == null) 
            return null;
        Match match = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return match;
    }

    
    public boolean isEmpty() {
        return front == null;
    }
}

    
