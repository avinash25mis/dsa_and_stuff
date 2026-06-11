package com.dsa.graph;

import com.dsa.graph.core.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GraphDFS {


    public static void dfs(Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.print(node.key + " ");

        for (Node neighbor : node.neighbors) {
            dfs(neighbor, visited);
        }
    }


    public static void dfsIterative(Node start) {
        if (start == null) return;

        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node.key + " ");

                for (Node neighbor : node.neighbors) {
                    stack.push(neighbor);
                }
            }
        }
    }

}
