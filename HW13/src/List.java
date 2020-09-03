

public class List<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;
    Node node = new Node<>();


    public List(T[] array) {
        for (T temp : array) {
            addLast(temp);
        }
    }


    public void addFirst(T element) {
        node.setData(element);
        if (isEmptyHead()) {
            head = node;
            last = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addLast(T data) {
        if (isEmptyHead()) {
            addFirst(data);
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void addByIndex(int index, T element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node<T> nodeBefore = node(index - 1);
            Node<T> nodeAfter = node(index);
            Node<T> newNode = new Node<T>(element, nodeAfter);
            nodeBefore.setNext(newNode);
            size++;
        }
    }

    public void delFirst() {
        if (isEmptyHead())
            return;
        else {
            head = head.getNext();
            size--;
        }
    }

    public void delLast() {

        if (isEmptyLast())
            return;
        else {
            last = node.getNext();
            size--;
        }

    }

    public void interchange(int indexFist, int indexSecond) {
        Node fist = node(indexFist);
        Node second = node(indexSecond);
        Node tmp = fist.getNext();
        second.setNext(fist);
        tmp.setNext(second);
    }

    public void delByIndex(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0)
            delFirst();
        else {
            Node<T> before = node(index - 1);
            Node<T> after = node(index + 1);
            before.setNext(after);
            size--;
        }
    }


    private Node<T> node(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        Node<T> result = node;
        for (int i = 0; i < index; i++) {
            result = result.getNext();
        }
        return result;
    }

    public int size() {
        Node node = head;
        int size = 0;
        if (isEmptyHead()) {
            return 0;
        } else {
            while (node != null) {
                size++;
                node = node.getNext();
            }
            return size;
        }
    }

    public boolean isEmptyLast() {
        return last == null;
    }

    public boolean isEmptyHead() {
        return head == null;
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", last=" + last +
                ", size=" + size +
                ", node=" + node +
                '}';
    }
}
