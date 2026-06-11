package com.dsa.graph;

import com.dsa.graph.core.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphUtility {


    /*


        1
       / \
      2   3
     /     \
    4       5


* */
    public static Node generateUndirectedGraph(){

        // Create nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // Build graph (undirected example)
        n1.neighbors.add(n2);
        n1.neighbors.add(n3);

        n2.neighbors.add(n1);
        n2.neighbors.add(n4);

        n3.neighbors.add(n1);
        n3.neighbors.add(n5);

        n4.neighbors.add(n2);
        n5.neighbors.add(n3);

        return n1;
    }



    /*

            1 → 2 → 4
            ↓
            3 → 5


* */


    public static Node generateDirectedGraph() {
        // Create nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // Build directed graph (unidirectional edges)
        n1.neighbors.add(n2);  // 1 → 2
        n1.neighbors.add(n3);  // 1 → 3
        n2.neighbors.add(n4);  // 2 → 4
        n3.neighbors.add(n5);  // 3 → 5

        return n1;
    }

    public static void printGraph(Node root) {
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("Node " + current.key + " -> ");
            for (Node neighbor : current.neighbors) {
                System.out.print(neighbor.key + " ");
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);  // For BFS-like discovery, but just printing here
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Node undirectedGraphRoot = generateUndirectedGraph();
        System.out.println("Undirected Graph:");
        printGraph(undirectedGraphRoot);

        Node directedGraphRoot = generateDirectedGraph();
        System.out.println("\nDirected Graph:");
        printGraph(directedGraphRoot);
    }

}
