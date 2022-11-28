package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(Objects.requireNonNull(firstQueue.remove()));
        result.add(Objects.requireNonNull(firstQueue.remove()));
        result.add(Objects.requireNonNull(secondQueue.remove()));
        result.add(Objects.requireNonNull(secondQueue.remove()));

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(result.removeLast());
                result.addLast(firstQueue.remove());
                result.addLast(firstQueue.remove());
            }
            if (!secondQueue.isEmpty()) {
                secondQueue.add(result.removeLast());
                result.addLast(secondQueue.remove());
                result.addLast(secondQueue.remove());
            }
        }
        return result;
    }
}
