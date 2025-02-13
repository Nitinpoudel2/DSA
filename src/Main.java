package src;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    Queue<Double> queue = new PriorityQueue<>();

    queue.offer(2.1);
    queue.offer(3.2);
    queue.offer(4.0);
    queue.offer(3.8);
    while(!queue.isEmpty()){
        System.out.println(queue.poll());
    }
    }
}