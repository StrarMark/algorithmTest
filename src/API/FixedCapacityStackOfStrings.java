package API;

import java.util.Arrays;

// 定容字符串栈，数组实现
public class FixedCapacityStackOfStrings {
    private String[] a ;
    private int N;
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(String item){
        a[N++]=item;
    }
    public String pop(){
        return a[--N];
    }

    @Override
    public String toString() {
        return "FixedCapacityStackOfStrings{" +
                "a=" + Arrays.toString(a) +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(-2>>1);
        System.out.println(2<<1);
        System.out.println(-2>>>1);
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
        s.push("a");
        System.out.println("s = " + s.toString());
        s.push("b");
        System.out.println("s = " + s);
        s.push("c");
        System.out.println("s = " + s);
        s.push("d");
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
        s.pop();
        System.out.println("s = " + s);
        int b=0;
        int a;
        a = ++b;
        System.out.println("a = " + a);
    }
}
