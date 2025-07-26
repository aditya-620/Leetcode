class MyStack {
    Queue<Integer> q;
    int size;

    public MyStack() {
        this.q = new LinkedList<>();
        this.size = 0;
    }

    public void push(int x) {
        q.add(x);
        size++;
        // Rotate the queue to make the last added element come to the front
        for (int i = 1; i < size; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        size--;
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return size == 0;
    }
}
