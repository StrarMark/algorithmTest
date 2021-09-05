package API;

import java.util.ArrayList;
import java.util.Arrays;
// 定容栈
public class FixedCapacityStack<Item> {
    private Item[] items;
    private int N;
    public FixedCapacityStack(int cap){
        items = (Item[]) new Object[cap];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        items[N++]=item;
    }
    public Item pop(){
        return items[--N];
    }

    @Override
    public String toString() {
        return "FixedCapacityStack{" +
                "items=" + Arrays.toString(items) +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        /*int oldCapacity = Integer.MAX_VALUE - 16;
        System.out.println(oldCapacity);
        int minCapacity = Integer.MAX_VALUE - 15;
        int maxSize = Integer.MAX_VALUE - 8;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - maxSize > 0)
            //newCapacity = hugeCapacity(minCapacity);    // minCapacity is usually close to size, so this is a win:
        System.out.println(newCapacity);
        ArrayList<Integer> objects = new ArrayList<>(Integer.MAX_VALUE / 4);*/

        FixedCapacityStack<String> s = new FixedCapacityStack<>(10);
        s.push("a");
        System.out.println("s = " + s.toString());
        s.push("b");
        System.out.println("s = " + s);
        s.push("c");
        System.out.println("s = " + s);
        s.push("d");
        System.out.println("s = " + s);
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
