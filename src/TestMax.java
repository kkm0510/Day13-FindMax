public class TestMax {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c){
        T max=a;
        if(b.compareTo(max)>0) max=b;
        if(c.compareTo(max)>0) max=c;
        return max;
    }

    public static void main(String[] args) {

        System.out.println("TC-1.1 : " + findMax(4, 2, 3));
        System.out.println("TC-1.2 : " + findMax(2, 4, 3));
        System.out.println("TC-1.3 : " + findMax(2, 3, 4));
        System.out.println("TC-2.1 : " + findMax(4.0f, 2.0f, 3.0f));
        System.out.println("TC-2.2 : " + findMax(2.0f, 4.0f, 3.0f));
        System.out.println("TC-2.3 : " + findMax(2.0f, 3.0f, 4.0f));
        System.out.println("TC-3.1 : " + findMax("Apple", "Peach", "Banana"));
        System.out.println("TC-3.2 : " + findMax("Apple", "Peach", "Banana"));
        System.out.println("TC-3.3 : " + findMax("Apple", "Peach", "Banana"));
    }
}
