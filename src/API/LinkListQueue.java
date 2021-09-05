package API;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 队列  链表实现
 * @param <Item>
 */
public class LinkListQueue<Item> implements Iterable<Item>{
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
    private Node last;
    private int N;
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        Node oldNode = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first=last;
        }else{
            oldNode.next = last;
        }
        N++;
    }

    public Item dequeue(){
        Item item = first.item;
        first= first.next;
        N--;
        if (isEmpty()) {
            last =null;
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>() {
            private Node current = first;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public Item next() {
                Item item = current.item;
                current = current.next;
                return item;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Item previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Item item) {

            }

            @Override
            public void add(Item item) {

            }
        };
    }

    @Override
    public void forEach(Consumer<? super Item> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Item> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        LinkListQueue<String> stringLinkListQueue = new LinkListQueue<>();
        stringLinkListQueue.enqueue("aa");
        stringLinkListQueue.enqueue("bb");
        stringLinkListQueue.enqueue("cc");
        stringLinkListQueue.enqueue("dd");
        System.out.println("stringQueue = " + stringLinkListQueue);
        Iterator<String> iterator = stringLinkListQueue.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        stringLinkListQueue.dequeue();
        stringLinkListQueue.dequeue();
        stringLinkListQueue.dequeue();
        System.out.println("stringQueue = " + stringLinkListQueue);
        stringLinkListQueue.dequeue();
        System.out.println("stringQueue = " + stringLinkListQueue);
    }
}
