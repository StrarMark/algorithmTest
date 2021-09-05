package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//下压栈
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    private void push(Item item) {
        if (a.length == N) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    private Item pop() {
        Item item = a[--N];
        // 避免对象游离
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }

    @Override
    public String toString() {
        return "ResizingArrayStack{" +
                "a=" + Arrays.toString(a) +
                ", N=" + N +
                '}';
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        Iterator<String> iterator1 = strings.iterator();
        while (true) {
            if (!iterator1.hasNext()) break;
            System.out.println(iterator1.next());
        }
        ResizingArrayStack<String> s = new ResizingArrayStack<>();
        s.push("a");
        System.out.println("s = " + s);
        s.push("b");
        System.out.println("s = " + s);
        s.push("c");
        System.out.println("s = " + s);
        s.push("d");
        System.out.println("s = " + s);
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        String pop = s.pop();
        System.out.println("pop = " + pop);
        System.out.println("s = " + s);
        String pop1 = s.pop();
        System.out.println("pop1 = " + pop1);
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
    }
}
