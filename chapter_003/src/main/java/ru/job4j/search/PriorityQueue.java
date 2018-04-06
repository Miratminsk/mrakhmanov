package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void add(Task task) {
      this.tasks.add(task);
    }

    public void put(Task task) {
        this.tasks.add(task.getPriority() - 1, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
