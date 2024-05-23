public interface QueueInterface<T> {

    public void add(T item);
    public T poll();
    public T peek();
    public boolean isEmpty();
    public int size();
    public boolean contains(T item);
    
}