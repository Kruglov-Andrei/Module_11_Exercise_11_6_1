import java.util.Scanner;

public class Exercise_11_6_1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("В задаче требуется найти разницу переменных a и b");
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Введите значение переменной a" + "\n");
            int a;
            if (sc1.hasNextInt()) {
                a = sc1.nextInt();
                System.out.print("Введите значение переменной b" + "\n");
                int b;
                if (sc1.hasNextInt()) {
                    b = sc1.nextInt();
                    int g;
                    SubstractMethod sm = new SubstractMethod();
                    try {
                        int c = sm.substract(a, b);
                        System.out.println("Разница переменных a и b = " + c);
                        System.out.println("Никаких исключений при решении задачи не произошло." + "\n");
                    } catch (MyException e) {
                        System.out.println("В процессе решения задачи произошло исключение " + e);
                    }
                    System.out.println("Решение задачи завершено");
                    break;
                }
                else{
                    System.out.println("Вы ввели неверную переменную b");
                    break;
                }
            }
            else{
                System.out.println("Вы ввели неверную переменную a");
                break;
            }
        }
    }
}