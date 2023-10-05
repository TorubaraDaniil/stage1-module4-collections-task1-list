package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> createdList = new LinkedList<Integer>();
        int sizeOfSourceList = sourceList.size();
        for (int number: sourceList) {
            if (number % 2 != 0){
                createdList.addFirst(number);
            }
            else {
                createdList.addLast(number);
            }
        }
        return createdList;
    }
}
