package com.dsa.linklist;


import com.dsa.linklist.core.MyLinkListUtils;
import com.dsa.linklist.core.SinglyNode;

public class Reversal {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,0};
        SinglyNode listNode = MyLinkListUtils.generateLinkedList(arr);
        MyLinkListUtils.printTheLinkedList(listNode);
       // ListNode reversed=reverseUsingTwoPointer(listNode);
        SinglyNode reversed= reverseUsingThreePointer(listNode);
        MyLinkListUtils.printTheLinkedList(reversed);
    }

    private static SinglyNode reverseUsingThreePointer(SinglyNode listNode) {
        SinglyNode prev=null;
        SinglyNode curr=listNode;
        SinglyNode next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        listNode=prev;
        return  listNode;
    }

    private static SinglyNode reverseUsingTwoPointer(SinglyNode listNode) {
        SinglyNode prev = null;
        SinglyNode curr = listNode;

        while (curr!= null) {
            SinglyNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        listNode=prev; //this is make new head

        return listNode;
    }

    public static void tryIt(SinglyNode listNode){


    }
}
