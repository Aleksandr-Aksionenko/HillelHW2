import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Run {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 41, 13, 3, 22, 14};
        List list = new List(data);
  
        list.isEmptyHead();

        list.addFirst(9);
        list.delByIndex(2);
        list.addByIndex(5,3);
        list.delLast();
        list.addLast(3);
        list.interchange(2,5);
        System.out.println(list.toString());

    }
}
