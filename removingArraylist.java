package iterate;

import java.util.ArrayList;
//Write a Java program to remove the third element from a array list.
public class removingArraylist {
    public static void main(String[] args) {
        ArrayList<String>shape=new ArrayList<>();
        shape.add("Square");
        shape.add("triangle");
        shape.add("rectangle");
        shape.add("circle");
        shape.add("cylinder");
        shape.add("trapezium");
        shape.add("Parallelogram");
        shape.add("isosceles");
        shape.add("oval");
        shape.add("sphere");

        System.out.println("before removing the third element: " + shape);

        shape.remove(2);


        System.out.println("After removing the third element: "+ shape);
    }
}
