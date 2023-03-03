package iterate;

import java.util.ArrayList;
import java.util.Scanner;

//4.Write a Java program to retrieve an element (at a specified index) from a given array list.
public class retriveelement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>Food=new ArrayList<>();
        String A=sc.nextLine();



        Food.add("Anjero");
        Food.add("rice");
        Food.add("pasta");
        Food.add("chapati");
        Food.add("mandazi");
        Food.add("ugali");
        Food.add("macaroni");
        Food.add("pancake");
        Food.add("pizza");
        Food.add("burger");
        System.out.println(Food);
        String food= Food.get(0);
        System.out.println("the first index: " + food);
        food= Food.get(8);
        System.out.println("the 8th index: "+ food);
    }
}
