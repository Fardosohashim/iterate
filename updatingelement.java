package iterate;

import java.util.ArrayList;
//5.Write a Java program to update specific array element by given element.
public class updatingelement {
    public static void main(String[] args) {
        ArrayList<Integer> mynum = new ArrayList<>();
        mynum.add(10);
        mynum.add(60);
        mynum.add(90);
        mynum.add(30);
        mynum.add(80);
        mynum.add(20);
        mynum.add(70);
        mynum.add(20);
//before setting
        System.out.println(mynum);
        mynum.set(5,100);
        //After setting
       System.out.println(mynum);
    }

}
