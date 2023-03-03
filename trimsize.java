package iterate;

import java.util.ArrayList;
//19.Write a Java program to trim the capacity of an array list the current list size.
public class trimsize {
    public static void main(String[] args) {
        ArrayList<String> c= new ArrayList<String>();
        c.add("Red");
        c.add("Green");
        c.add("Black");
        c.add("White");
        c.add("Pink");
        System.out.println("Original array list: " + c);
        System.out.println("trim of size: ");
        c.trimToSize();
        System.out.println(c);
    }
}
