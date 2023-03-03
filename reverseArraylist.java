package iterate;

import java.util.ArrayList;
import java.util.Collections;
//11.Write a Java program to reverse elements in a array list.
public class reverseArraylist {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        System.out.println("Before Reversing");
        System.out.println(list.toString());
        Collections.reverse (list);

        System.out.println("After Reversing");
        System.out.println(list);
    }

}
