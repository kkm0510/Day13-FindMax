public class TestMax <T extends Comparable<T>>{

    public T findMax(T a, T b, T c){
        T max=a;
        if(b.compareTo(max)>0) max=b;
        if(c.compareTo(max)>0) max=c;
        return max;
    }

    public static void main(String[] args) {

        TestMax<Integer> maxInteger=new TestMax<>();
        TestMax<Float> maxFloat=new TestMax<>();
        TestMax<String> maxString=new TestMax<>();
        System.out.println("TC-1.1 : " + maxInteger.findMax(4, 2, 3));
        System.out.println("TC-1.2 : " + maxInteger.findMax(2, 4, 3));
        System.out.println("TC-1.3 : " + maxInteger.findMax(2, 3, 4));
        System.out.println("TC-2.1 : " + maxFloat.findMax(4.0f, 2.0f, 3.0f));
        System.out.println("TC-2.2 : " + maxFloat.findMax(2.0f, 4.0f, 3.0f));
        System.out.println("TC-2.3 : " + maxFloat.findMax(2.0f, 3.0f, 4.0f));
        System.out.println("TC-3.1 : " + maxString.findMax("Apple", "Peach", "Banana"));
        System.out.println("TC-3.2 : " + maxString.findMax("Apple", "Peach", "Banana"));
        System.out.println("TC-3.3 : " + maxString.findMax("Apple", "Peach", "Banana"));
    }
}
