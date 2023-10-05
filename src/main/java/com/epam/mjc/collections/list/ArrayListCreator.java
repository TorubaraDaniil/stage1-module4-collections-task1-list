package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> listOfDuplicates = new ArrayList<>();
        for (String word : sourceList) {
            int index = sourceList.indexOf(word) + 1;
            if(index % 3 == 0){
                listOfDuplicates.add(word);
                listOfDuplicates.add(word);
            }
        }
        return listOfDuplicates;
    }
}

