package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> mix = new ArrayList<String>();
        mix.addAll(firstList);
        mix.addAll(secondList);
        Comparator<String> reverse = Comparator.reverseOrder();
        PriorityQueue<String> result = new PriorityQueue<>(reverse);
        result.addAll(mix);
        return result;
    }
}
