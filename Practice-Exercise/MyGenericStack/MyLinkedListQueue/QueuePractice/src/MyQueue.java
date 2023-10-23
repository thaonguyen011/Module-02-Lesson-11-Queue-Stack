public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        if (queueSize < 0) throw new RuntimeException("queueSize is not a negative number");
        queueArr = new int[queueSize];
        capacity = queueSize;
    }

    public boolean isQueueFull() {
        return currentSize >= capacity;
    }

    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item){
        if (isQueueFull()) throw new RuntimeException("Queue is full");
        queueArr[currentSize] = item;
        currentSize++;
    }

    public void dequeue() {
        if (isQueueEmpty()) throw new RuntimeException("Queue is empty");
        System.arraycopy(queueArr, 1, queueArr, 0, currentSize - 1);
        currentSize--;
    }

    public String toString() {
        if (isQueueEmpty()) return null;

        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < currentSize - 1; i++) {
            result.append(queueArr[i]).append(",");
        }
        result.append(queueArr[currentSize - 1]).append("]");

        return result.toString();
    }
}
