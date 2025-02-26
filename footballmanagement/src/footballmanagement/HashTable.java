/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class HashTable {
    
    public final HashTableNode[] table;

    public HashTable(int size) {
        table = new HashTableNode[size];
    }

    private int hash(int id) {
        return id % table.length; 
    }

    public void add(Team team) {
        int index = hash(team.getTeamID());
        HashTableNode newNode = new HashTableNode(team.getTeamID(), team.getTeamName());

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            HashTableNode current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void add(Player player) {
        int index = hash(player.getPlayerID());
        HashTableNode newNode = new HashTableNode(player.getPlayerID(), player.getPlayerName());

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            HashTableNode current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String get(int id) {
        int index = hash(id);
        HashTableNode current = table[index];

        while (current != null) {
            if (current.id == id) {
                return current.name;
            }
            current = current.next;
        }
        return null; 
    }

    public void displayHashTable() {
        for (int i = 0; i < table.length; i++) {
        System.out.print("Index " + i + ": ");
        HashTableNode current = table[i];
        
        while (current != null) {
            System.out.print(current.name); 
            
            if (current.next != null) { 
                System.out.print(" -> ");
            }
            
            current = current.next; 
        }
        
        System.out.println(); 
    }
}
    }

