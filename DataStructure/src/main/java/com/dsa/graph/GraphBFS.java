package com.dsa.graph;

import com.dsa.graph.core.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphBFS {


    public static void bfs(Node start)
    {

        if (start == null)
           return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.key + " ");
            for (Node neighbor : node.neighbors)
            {
                if (!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    queue.offer(neighbor); // same as queue.add
                }
            }
        }
    }

}
