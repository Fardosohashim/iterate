package iterate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//9.Write a Java program to copy one array list into another.
public class copyArraylist {
    public static void main(String[] args) {
        ArrayList<String>Names1=new ArrayList<>();
        Names1.add("Ali");
        Names1.add("Abdi");
        Names1.add("Mohamed");
        Names1.add("Khalid");
        Names1.add("mohamed");

        System.out.println("list1:"+Names1);
        ArrayList<String>Names2=new ArrayList<>();
        Names2.add("A");
        Names2.add("B");
        Names2.add("C");
        Names2.add("D");
        Names2.add("E");
        System.out.println("list2: " + Names2);

        Collections.copy(Names1,Names2);

        System.out.println("After copy");

        System.out.println( "List1:" +Names1 );
        System.out.println("List2: " + Names2 );
    }
}
