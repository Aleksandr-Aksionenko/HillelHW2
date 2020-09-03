public class Run {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 41, 13, 3, 22, 14};
        List list = new List(data);
        list.isEmptyHead();
        list.interchange(3,4);
        list.addFirst(9);
        list.delFirst();
        list.delByIndex(2);
        list.addByIndex(5,23);
        list.delLast();
        list.addLast(3);
        System.out.println(list.toString());
    }
}
