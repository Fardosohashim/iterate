package iterate;

import java.util.ArrayList;
import java.util.Collections;
//14.Write a Java program of swap two elements in an array list.
public class swapingofarraylist {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("dog");
        name.add("cat");
        name.add("cup");
        name.add("cap");
        name.add("van");
        name.add("fun");
        name.add("gun");
        System.out.println("before swaping " +name);

        Collections.swap(name,3,6);
        System.out.println("After swaping");
        for (String r:name) {
            System.out.println(r);
        }
    }
}
