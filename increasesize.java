package iterate;

import java.util.ArrayList;
//20. Write a Java program to increase the size of an array list.
public class increasesize{
        public static void main(String[] args) {
    ArrayList<String> utensils= new ArrayList<String>(5);
    utensils.add("spoons");
    utensils.add("cups");
    utensils.add("plates");
    utensils.add("knife");
    utensils.add("fryimg pan");
    System.out.println("before capacity" + utensils);
            utensils.ensureCapacity(5);
            utensils.add("sufuria");
            utensils.add("jug");
            utensils.add("thermos");
            utensils.add("spatula");
            utensils.add("grater");

            System.out.println("New array list: " + utensils);
}
}
