package service;

import model.*;

import java.util.PriorityQueue;

public class ReservationManager {

    private PriorityQueue<User> waitingQueue;

    public ReservationManager() {
        waitingQueue = new PriorityQueue<>(
            (u1, u2) -> u2.getPriority() - u1.getPriority()
        );
    }

    public void addToQueue(User user) {
        waitingQueue.add(user);
    }

    public User getNextUser() {
        return waitingQueue.poll();
    }

    public boolean hasWaitingUsers() {
        return !waitingQueue.isEmpty();
    }
}
