/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanagement;

/**
 *
 * @author hayrunisa
 */
public class TeamHeap {
  
    
      private Team[] heap;
    private int size;

    public TeamHeap(int capacity) {
        heap = new Team[capacity];
        size = 0;
    }

    public void updateTeam(Team team) {
        for (int i = 0; i < size; i++) {
            if (heap[i].getTeamID() == team.getTeamID()) {
                heap[i] = team;
                heapify();
                return;
            }
        }
        insert(team);
    }

    private void heapify() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            bubbleDown(i);
        }
    }

    public void insert(Team team) {
        if (contains(team)) {
            return;
        }
        if (size >= heap.length) {
            resize();
        }
        heap[size] = team;
        bubbleUp(size);
        size++;
    }

    private boolean contains(Team team) {
        for (int i = 0; i < size; i++) {
            if (heap[i].getTeamID() == team.getTeamID()) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        Team[] newHeap = new Team[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }

    private void bubbleUp(int index) {
        int parent = (index - 1) / 2;
        if (parent >= 0 && compare(heap[parent], heap[index]) < 0) {
            swap(parent, index);
            bubbleUp(parent);
        }
    }

    private void bubbleDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < size && compare(heap[left], heap[largest]) > 0) {
            largest = left;
        }

        if (right < size && compare(heap[right], heap[largest]) > 0) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            bubbleDown(largest);
        }
    }

    private int compare(Team team1, Team team2) {
        if (team1.getTotalPoints() != team2.getTotalPoints()) {
            return team1.getTotalPoints() - team2.getTotalPoints();
        } else {
            return team1.getGoalDifference() - team2.getGoalDifference();
        }
    }

    private void swap(int i, int j) {
        Team temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        Team[] sortedTeams = getTeamsSorted();
        for (Team team : sortedTeams) {
            System.out.println(team.toString());
        }
    }

    public Team[] getTeamsSorted() {
        Team[] sortedTeams = new Team[size];
        System.arraycopy(heap, 0, sortedTeams, 0, size);
        java.util.Arrays.sort(sortedTeams, (a, b) -> {
            int pointComparison = Integer.compare(b.getTotalPoints(), a.getTotalPoints());
            return (pointComparison != 0) ? pointComparison : Integer.compare(b.getGoalDifference(), a.getGoalDifference());
        });
        return sortedTeams;
    }
}
