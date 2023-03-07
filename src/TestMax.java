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

    public E testMaximum() {
        return findMax(a, b, c);
    }

    public static <T extends Comparable<T>> T findMax(T... elements) {
        Arrays.sort(elements);
        return elements[elements.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new TestMax<>(4, 2, 3).testMaximum());
        System.out.println(new TestMax<>(4.0f, 2.0f, 3.0f).testMaximum());
        System.out.println(new TestMax<>("Apple", "Banana", "Peach").testMaximum());
        System.out.println(findMax(1, 2, 3, 8, 1, 2));
    }
}