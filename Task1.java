package Java_homework_4;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 10; i++)
        {
            l.add(rnd.nextInt(0, 10));
        }
        System.out.println(l);
        System.out.println(returnReverseList(l));
    }
    public static LinkedList<Integer> returnReverseList(LinkedList<Integer> list)
    {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (Integer item : list)
        {
            reverseList.add(0, item);
        }
        return reverseList;
    }
}
