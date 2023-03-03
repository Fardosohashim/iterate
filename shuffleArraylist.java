package iterate;

import java.util.ArrayList;
import java.util.Collections;
//10.Write a Java program to shuffle elements in a array list.
public class shuffleArraylist {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<>();
           name.add("fardowsa");
           name.add("Abdi");
           name.add("Ali");
           name.add("fatima");
           name.add("malyun");
           name.add("najah");
        System.out.println("before shuffle: "+name);
        Collections.shuffle(name);
        System.out.println("After shuffle: " + name);
    }
}
