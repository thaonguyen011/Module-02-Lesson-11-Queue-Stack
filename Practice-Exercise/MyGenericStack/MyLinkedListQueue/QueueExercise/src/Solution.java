public class Solution {
    static private void enQueue() {
        Queue myQueue = new Queue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);


        myQueue.printQueue();
    }

    static private void deQueue() {
        Queue myQueue = new Queue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);

        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.printQueue();
    }

    public static void main(String[] args) {
        enQueue();
        deQueue();
    }
}
