/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class BinarySearchTree {
    
     private BSTNode root;

     
    public BinarySearchTree() {
        this.root = null;
    }

    
    public void insert(Team team) {
        root = insertRec(root, team);
    }

    
    private BSTNode insertRec(BSTNode root, Team team) {
        if (root == null) {
            root = new BSTNode(team);
            return root;
        }
        if (team.getTeamName().compareTo(root.team.getTeamName()) < 0) {
            root.left = insertRec(root.left, team);
        } else if (team.getTeamName().compareTo(root.team.getTeamName()) > 0) {
            root.right = insertRec(root.right, team);
        }
        return root;
    }

    
    public void displayTeams() {
        inOrderTraversal(root);
    }
    

    private void inOrderTraversal(BSTNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.team.getTeamName().toUpperCase() );
            inOrderTraversal(root.right);
        }
        
    }
}