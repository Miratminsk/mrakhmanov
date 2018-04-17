package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int size = this.tasks.size();
        if (size == 0) {
            this.tasks.add(task);
        }
        for (int index = 0; index != size; index++) {
            if (tasks.get(index).getPriority() > task.getPriority()) {
                this.tasks.add(index, task);
                break;
            }
        }
    }
    public Task take() {
        return this.tasks.poll();
    }
}
