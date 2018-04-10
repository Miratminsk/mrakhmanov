package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.size() == 0) {
            this.tasks.add(tasks.size(), task);
        } else {
            Iterator<Task> iter = tasks.iterator();
            while (iter.hasNext()) {
                Task str = iter.next();
                    if (str.getPriority() > task.getPriority()) {
                        this.tasks.add(tasks.indexOf(str), task);
                        break;
                    }
                }
            }
        }
    public Task take() {
        return this.tasks.poll();
    }
}
