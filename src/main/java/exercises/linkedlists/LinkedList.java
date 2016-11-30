/**
 * 
 */
package exercises.linkedlists;

/**
 * 
 *
 * @author aherscu
 *
 */
@SuppressWarnings("javadoc")
public class LinkedList<E> {
    public static class Node<E> {
        final E e;
        Node<E> next;

        public Node(final E e) {
            this.e = e;
        }
    }

    private Node<E> head, tail;

    LinkedList<E> add(final E e) {
        tail = null != tail
            ? (tail.next = new Node<>(e))
            : (head = new Node<>(e));

        return this;
    }

    LinkedList<E> remove(final E e) {
        Node<E> currentNode = head;
        
        while(null != currentNode) {
            if(currentNode.e.equals(e)) {}
        }
        
        return this;
    }
}
