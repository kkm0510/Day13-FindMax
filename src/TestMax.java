public class TestMax <E extends Comparable<E>>{

    E a;
    E b;
    E c;

    TestMax(E a, E b, E c){
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public void testMaximum(){
        findMax(a, b, c);
    }

    public static <T extends Comparable<T>> void findMax(T a, T b, T c){
        T max=a;
        if(b.compareTo(max)>0) max=b;
        if(c.compareTo(max)>0) max=c;
        System.out.println(max);
    }

    public static void main(String[] args) {
        new TestMax<Integer>(4, 2, 3).testMaximum();
        new TestMax<Integer>(2, 4, 3).testMaximum();
        new TestMax<Integer>(2, 3, 4).testMaximum();

        new TestMax<Float>(4.0f, 2.0f, 3.0f).testMaximum();
        new TestMax<Float>(2.0f, 4.0f, 3.0f).testMaximum();
        new TestMax<Float>(2.0f, 3.0f, 4.0f).testMaximum();

        new TestMax<String>("Apple", "Banana", "Peach").testMaximum();
        new TestMax<String>("Banana", "Apple", "Peach").testMaximum();
        new TestMax<String>("Banana", "Peach", "Apple").testMaximum();

    }
}
