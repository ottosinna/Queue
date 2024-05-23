class Node<T> {

    // memebers
    private T item;
    private Node<T> next;

    // constructor

    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }

    // getters
    public T getItem() {
        return item;
    }

    public Node<T> getNext () {
        return next;
    }

    // setters
    public void setItem(T item) {
        this.item = item;
    }

    public void setNext (Node<T> next) {
        this.next = next;
    }
}