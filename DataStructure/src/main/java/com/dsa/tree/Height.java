package com.dsa.tree;

import com.dsa.tree.core.BinaryTree;
import com.dsa.tree.core.BinaryTreeUtils;
import com.dsa.tree.core.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Height {

/*
* for each individual parent root it takes out the left-height and right height
* example the lowest leaf node  left-height=0 && right-height =0  hence it returns 0+1
* similary at each level above it it keeps on adding last-left-height+1
*
*
* */

    public static int heightOfTreeRecurssionDFS(Node node) {

        if(node ==null){
            return 0;
        }else{
            int heightL = heightOfTreeRecurssionDFS(node.left);
            int heightR = heightOfTreeRecurssionDFS(node.right);
            if(heightL>heightR) {
                return heightL + 1;
            }else{
                return heightR +1 ;
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeUtils.generateBinaryTree();
        int i = heightOfTreeRecurssionDFS(binaryTree.root);
        int j = heightOfTreeIterativeBFS(binaryTree.root);
        System.out.println(i);
        System.out.println(j);

    }

    private static int heightOfTreeIterativeBFS(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;

        while (!queue.isEmpty()) {          // ← outer loop: runs once per LEVEL
            int levelSize = queue.size(); // number of nodes at current level
            height++; // key

            for (int i = 0; i < levelSize; i++) {  // ← inner loop: process a level only
                Node current = queue.poll();

                if (current.left != null)  queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return height;
    }


}
