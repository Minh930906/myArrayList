import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        MyArrayList a = new MyArrayList();
        for (int i = 0; i < 21; i++) {
            a.add(i);
        }
//        System.out.println(a.get(5));
//        a.printElements();
        System.out.println(a);
//        a.add(5,6);
        System.out.println(a.getArraysize());
        a.set(20,7);
        System.out.println(a);

//        a.add(5,6);
//        System.out.println(a.get(5));
//        System.out.println(a.toString());
//        a.add(5,8);
//        System.out.println(a.toString());
//        a.remove(6);
        List b = new ArrayList();
        MyLinkedList c = new MyLinkedList();
        c.add(5);
        System.out.println(a.get(18));
        a.clear();
        c.add(6);
        c.add(8);
        c.add(9);
        c.set(1,3);
        c.show();
        System.out.println(c.isEmpty());
//        c.clear();
//        System.out.println(c.isEmpty());
//        c.show();
        System.out.println(c.get(2));
    }
}
