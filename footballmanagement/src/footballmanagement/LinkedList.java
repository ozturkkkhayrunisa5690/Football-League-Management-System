/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class LinkedList{
    
    
     Node head;

    
    public void add(Player data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void remove(int id) {
        if (head == null) return;

        
        if (head.data.playerID == id) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data.playerID != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

  
    public Node find(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.playerID == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    
}