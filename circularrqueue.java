public class circularrqueue {
    private int[] Q;
    private int f = 0, r = 0, size = 0, capacity;

    public circularrqueue(int cap) {
        capacity = cap + 1; // extra space
        Q = new int[capacity];
    }

    public boolean enqueue(int x) {
        if ((r + 1) % capacity == f) return false;
        Q[r] = x;
        r = (r + 1) % capacity;
        size++;
        return true;
    }

    public Integer dequeue() {
        if (f == r) return null;
        int val = Q[f];
        f = (f + 1) % capacity;
        size--;
        return val;
    }

    public Integer peek() {
        if (f == r) return null;
        return Q[f];
    }

    public boolean isEmpty() {
        return f == r;
    }

    public static void main(String[] args) {
        circularrqueue cq = new circularrqueue(3);
        cq.enqueue(1); cq.enqueue(2); cq.enqueue(3);
        System.out.println(cq.enqueue(4)); // false
        System.out.println(cq.dequeue()); // 1
        System.out.println(cq.peek()); // 2
    }
}
