package iterate;

import java.util.ArrayList;
//Write a Java program to join two array lists
public class joiningtwoarraylist {
    public static void main(String[] args) {
        ArrayList<String> group1 = new ArrayList<>();
        group1.add("hydrogen");
        group1.add("lithium");
        group1.add("sodium");
        group1.add("potassium");
        System.out.println("list of group1 " + group1);
        ArrayList<String> group2 = new ArrayList<>();
        group2.add("Beryllium");
        group2.add("magnesium");
        group2.add("calcium");
        group2.add("radium");
        System.out.println("list of group2 " + group2);
        ArrayList<String> i=new ArrayList<>();
        i.addAll(group1);
        i.addAll(group2);
        System.out.println("new group: " + i);

    }
}
