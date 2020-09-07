

public class List<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;
    Node node = new Node<>();

    public List() {

    }

    public List(T[] array) {
        for (T tmp : array) {
            addLast(tmp);
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
        size++;
    }

    public void addByIndex(int index, T element) {
        if (index == 0) {
            addFirst(element);
        } else {
            Node<T> nodeBefore = getNode(index - 1);
            Node<T> nodeAfter = getNode(index);
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

        if (last == null)
            return;
        else {
            last = node.getNext();
            size--;
        }

    }
    public void delByIndex(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0)
            delFirst();
        else {
            Node<T> before = getNode(index - 1);
            Node<T> after = getNode(index + 1);
            before.setNext(after);
            size--;
        }
    }


    public void interchange(int indexFirst, int indexSecond) {
        if (indexFirst == 0) {
            Node first = getNode(indexFirst);
            Node second = getNode(indexSecond - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        } else if (indexSecond == 0) {
            Node first = getNode(indexSecond);
            Node second = getNode(indexFirst - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        } else {
            Node first = getNode(indexFirst-1);
            Node second = getNode(indexSecond - 1);
            Node tmp = first.getNext();
            second.setNext(first);
            tmp.setNext(second);
        }
    }


    private Node<T> getNode(int index) {
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


    public boolean isEmptyHead() {
        return head == null;
    }
    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i < size; i++) {
            out = out + getNode(i).getData();
        }
        return out;
    }
}
