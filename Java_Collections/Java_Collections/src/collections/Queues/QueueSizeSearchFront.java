package collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFront {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Jennifer");
        waitingQueue.add("Angelina");
        waitingQueue.add("Jude");
        waitingQueue.add("Yemi");

        System.out.println("WaitingQueue : " + waitingQueue);

        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }

        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

    }
}
