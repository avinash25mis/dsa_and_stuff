package com.dsa.graph.core;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int key;
    public List<Node> neighbors;

    public Node(int key) {
        this.key = key;
        this.neighbors = new ArrayList<>();
    }

/*
an undirected graph is essentially the same as a bidirectional graph in graph theory.
 In an undirected graph, edges have no direction, so you can traverse from node A to node B and vice versa
 along the same edge. This makes it bidirectional by default.

* */



}
