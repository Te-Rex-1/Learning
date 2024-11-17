package DSA;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
    // add element
        list.add(234);
        list.add(23);
        System.out.println(list);
        // get elements
        System.out.println(list.get(1));
        System.out.println(list.get(13));

    }
}
