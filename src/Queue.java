public interface Queue<T> {
    void enqueue(T element);
    T dequeue() throws Exception;
    int count();
    String show();
}
