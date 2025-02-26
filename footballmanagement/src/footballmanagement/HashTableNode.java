/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class HashTableNode {
    
    
    public int id; 
    public String name; 
    public HashTableNode next;

    public HashTableNode(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
    
}
