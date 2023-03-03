package iterate;

import java.util.ArrayList;
//18.Write a Java program to test an array list is empty or not.
public class emptyarrraylistornot {
    public static void main(String[] args) {
        ArrayList<String> animal=new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("lion");
        animal.add("cub");
        animal.add("elephant");
        animal.add("cow");
        animal.add("monkey");
        animal.add("birds");
        System.out.println("before removing "+ animal);

        animal.removeAll(animal);
        System.out.println("After removing"+animal);

    }
}
