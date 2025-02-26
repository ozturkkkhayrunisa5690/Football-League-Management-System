/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
class Node  {
    
   
    public Player data;
    public Node next;

    Node(Player data) {
        this.data = data;
        this.next = null;
    }
}