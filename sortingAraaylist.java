package iterate;

import java.util.ArrayList;
import java.util.Collections;
//8.Write a Java program to sort a given array list.
public class sortingAraaylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(110);
        numbers.add(200);
        numbers.add(20);
        numbers.add(10);
        numbers.add(80);
        numbers.add(1);
        numbers.add(31);
        numbers.add(4);
        Collections.sort(numbers);
        for (int A:numbers) {
            System.out.println(A);

        }
    }
}
