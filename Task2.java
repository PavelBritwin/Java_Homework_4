// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Java_homework_4;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
        {
            list.add(rnd.nextInt(0, 10));
        }
        System.out.println(list);
        enqueue(25);
        System.out.println("Enqueue: " + list);
        System.out.println("First item: " + dequeue());
        System.out.println("Dequeue :" + list);
        System.out.println("First item: " + first());
        System.out.println("Dequeue :" + list);
    }
    public static void enqueue(Integer item)
    {
        list.add(item);
    }
    public static Integer dequeue()
    {
        Integer returnAndremove = list.get(0);
        list.remove(0);
        return returnAndremove;
    }
    public static Integer first()
    {
        return list.get(0);
    }
}
