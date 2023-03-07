import java.util.Arrays;

public class TestMax<E extends Comparable<E>> {

    E a;
    E b;
    E c;

    TestMax(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E testMaximum(E... elements) {
        return findMax(a, b, c, elements);
    }

    public static <T extends Comparable<T>> T findMax(T a, T b, T c, T... elements) {
        Arrays.sort(elements);
        T max=elements[elements.length-1];
        if(a.compareTo(max)>0) max=c;
        if(b.compareTo(max)>0) max=b;
        if(c.compareTo(max)>0) max=c;
        return max;
    }

    public static void main(String[] args) {
        TestMax<String> test=new TestMax<>("apple","banana","grapes");
        System.out.println("Max = " + test.testMaximum("mango", "papaya"));
    }
}