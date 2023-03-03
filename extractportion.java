package iterate;

import java.util.ArrayList;
import java.util.List;

public class extractportion {

    public static void main(String[]args){

        ArrayList<Integer>num=new ArrayList<>();
        num.add(12);
        num.add(14);
        num.add(9);
        num.add(8);
        num.add(3);
        num.add(10);
        System.out.println("original Array list: " +num);
        List<Integer> c =num.subList(0,3);

        System.out.println("new array list "+ c);
    }
}
