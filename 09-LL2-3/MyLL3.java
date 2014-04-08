public class MyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    public MyLinkedList() {
	head = new Node("arbitrary");
	tail = head;
    }
}
