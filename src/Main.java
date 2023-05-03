import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1.Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int n = 5;
        int sum = (n * (n + 1) / 2);
        System.out.printf("Сумма чисел от 1 до %d = %d.\n", n, sum);
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.printf("Факториал числа %d = %d\n", n, factorial);

//2. Вывести все простые числа от 1 до 1000
        for (int i = 2; i <= 1000; i++) {
            boolean prime = true;
            for (int j = 2; j  < i ; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.printf("%d, " ,i);
            }
        }
        System.out.println();

//3. Реализовать простой калькулятор
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: \n");
        double first = scanner.nextDouble();
        System.out.print("Введите операцию: \n");
        String str = scanner.next();
        System.out.print("Введите второе число: \n");
        double second = scanner.nextDouble();
        switch (str) {
            case "-" -> System.out.printf("Ответ %.2f.", first - second);
            case "+" -> System.out.printf("Ответ %.2f.", first + second);
            case "*" -> System.out.printf("Ответ %.2f.", first * second);
            case "/" ->{
                if (second == 0){
                    System.out.println("На ноль дельть нельзя.");
                }else {
                    System.out.printf("Ответ %.2f.", first / second);
                }
            }
            default -> System.out.println("Нет такой операции.");
        }
    }
}