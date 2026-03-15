package com.dsa.linklist.core;



public class MyLinkListUtils {


    public static SinglyNode generateLinkedList(int arr[]){
        SinglyNode topParent= new SinglyNode();
        SinglyNode adder=topParent; //adder node to traverse the com.dsa.linklist while adding
        adder.val=arr[0];
        for(int i=1;i<arr.length;i++){ // loop to traverse the array
            SinglyNode newNode=new SinglyNode();
            newNode.val=arr[i];
            adder.next=newNode;
            adder=adder.next;    // i++ with adder=adder.next does both the traversing
        }

        return topParent;

    }

    public static void printTheLinkedList(SinglyNode listNode){
        SinglyNode traversal=listNode;
        while (traversal!=null){
            System.out.print(traversal.val+",");
            traversal=traversal.next;
        }
        System.out.println();
    }

}
