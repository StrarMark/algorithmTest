package API;

/**
 * 下压堆栈 数组实现
 * @param <Item>
 */
public class ArrayStack<Item> {
    private class Node{
        Item item;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
    private Node first;
    private int N;

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "first=" + first +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        ArrayStack<String> stringArrayStack = new ArrayStack<>();
        stringArrayStack.push("aa");
        stringArrayStack.push("bb");
        System.out.println("stringStack = " + stringArrayStack);
        stringArrayStack.pop();
        System.out.println("stringStack = " + stringArrayStack);
    }
}
