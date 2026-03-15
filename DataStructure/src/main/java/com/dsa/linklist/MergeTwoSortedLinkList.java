package com.dsa.linklist;

import com.dsa.linklist.core.MyLinkListUtils;
import com.dsa.linklist.core.SinglyNode;

public class MergeTwoSortedLinkList {

    public static void main(String[] args) {
        SinglyNode one = MyLinkListUtils.generateLinkedList(new int[]{1, 3, 5, 7, 9});
        SinglyNode two =  MyLinkListUtils.generateLinkedList(new int[] {0,2,4,8,11});
        SinglyNode result = mergeTwo(one,two);
        MyLinkListUtils.printTheLinkedList(result);
    }

    private static SinglyNode mergeTwo(SinglyNode one, SinglyNode two) {
        if(one==null){
            return two;
        }
        if(two==null){
            return one;
        }
        SinglyNode helperNode=new SinglyNode(-1);
        SinglyNode iteratorTwo=two;

    return null;

    }
}
