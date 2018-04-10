package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("E", 5));
        queue.put(new Task("D", 4));
        queue.put(new Task("C", 3));
        queue.put(new Task("B", 2));
        queue.put(new Task("A", 1));
        queue.put(new Task("B", 2));
        Task result = queue.take();
        assertThat(result.getDesc(), is("A"));
    }
}
