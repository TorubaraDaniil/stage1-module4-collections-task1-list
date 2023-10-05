package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int valueA = (int) (5 * Math.pow(intA, 2) + 3);
        int valueB = (int) (5 * Math.pow(intB, 2) + 3);
        int compared = valueA - valueB;
        return  (compared) == 0 ? intA - intB : compared;
    }
}
