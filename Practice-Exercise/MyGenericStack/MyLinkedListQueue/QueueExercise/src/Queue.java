public class Queue {
    private Node front;
    private Node rear;
    private int size;


    Queue() {
        front = rear = null;
    }


    public void enQueue(int number) {
        if (front == null && rear == null) front = rear = new Node(number);
        else {
            rear.link = new Node(number);
            rear = rear.link;
            rear.link = front;
        }
        size++;

    }

    public int deQueue() {
        if (front == null) throw new RuntimeException("queue is null");
        else {
            Node temp = front;
            if (size == 1) front = rear = null;
            else {
                front = front.link;
                rear.link = front;
            }
            size--;
            return temp.data;
        }
    }

    public void printQueue() {
        if (size == 0) {
            System.out.println("null");
            return;
        }

        StringBuilder result = new StringBuilder();
        Node temp = front;
        result.append("[");
         do {
                result.append(temp.data).append(",");
                temp = temp.link;
            } while (temp != rear);
        result.append(rear.data).append("]");
        System.out.println(result);
    }
}
