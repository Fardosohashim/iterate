package iterate;

import java.util.ArrayList;
import java.util.Collections;
//Write a Java program to empty an array list.
public class emptyofArraylist {
    public static void main(String[] args) {
        ArrayList<String>animal=new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("lion");
        animal.add("cub");
        animal.add("elephant");
        animal.add("cow");
        animal.add("monkey");
        animal.add("birds");
        System.out.println("before removing "+ animal);
        System.out.println("looking the array is empty or not: "+animal.isEmpty());

        animal.removeAll(animal);
        System.out.println("After removing" +animal);
        System.out.println("checking the array is empty or not "+animal.isEmpty());
    }
}
