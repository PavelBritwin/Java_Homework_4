package Java_homework_4;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: ");
        Integer result = scanner.nextInt();
        Integer secondNum = 0;
        st.push(result);
        while (true)
        {
            System.out.print("Введите операцию (+, -, *, /, Отмена): ");
            scanner = new Scanner(System.in, "Cp866");
            String operation = scanner.nextLine();
            if (!operation.contains("Отмена"))
            {
                System.out.print("Введите число: ");
                scanner = new Scanner(System.in, "Cp866");
                secondNum = scanner.nextInt();
            }
            switch (operation)
            {
                case ("+"):
                    result += secondNum;
                    System.out.print("Ответ: \n" + result + "\n");
                    st.push(result);
                    break;
                case ("-"):
                    result -= secondNum;
                    System.out.print("Ответ: \n" + result + "\n");
                    st.push(result);
                    break;
                case ("*"):
                    result *= secondNum;
                    System.out.print("Ответ: \n" + result + "\n");
                    st.push(result);
                    break;
                case ("/"):
                    result /= secondNum;
                    System.out.print("Ответ: \n" + result + "\n");
                    st.push(result);
                    break;
                case ("Отмена"):
                    st.pop();
                    result = st.lastElement();
                    System.out.print(result + "\n");
                    break;
                default:
                {
                    System.out.print("Введенная операция недоступна!\n");
                    break;
                }
            }
        }
    }
}
