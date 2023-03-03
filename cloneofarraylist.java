package iterate;

import java.util.ArrayList;
//16.Write a Java program to clone an array list to another array list
public class cloneofarraylist {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(19);
        number.add(12);
        System.out.println("ArrayList: " + number);


        ArrayList<Integer> cloneNumber = (ArrayList<Integer>) number.clone();

        System.out.println("Cloned ArrayList: " + cloneNumber);
    }
}