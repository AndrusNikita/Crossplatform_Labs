/*
Андрусь Микита (ІПЗ 18006Б)

1. Існують 2 основні види трансляції компіляція та інтерпритація
    Компіляція - процесс переведення коду мови програмування(вихідного коду) у машинний код з його подальшим виконанням процессором.
    Інтерпритація - процесс зчитування та виконання вихідного коду программою інтерпритатором.

2. Синтаксична помилка - помилка в символьному уявленні при написанні команди, приклад:
    SUstem.oYt.println("Hello World!");

   Симантична помилка - помилка в правильності смислового застосування команди, приклад:
    if(1==1){
        A=1;
    }

3. За рахунок попередньої трансляції вихідного кода програми в універсальний код Java Virtual Machine з його подальшою компіляцією

4.
*/
package Lab1;

import java.util.Scanner;

import static java.lang.Math.*;

public class lab1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 5;
        double c = 10;

        System.out.println("\t\t\t\tВведіть значення х:");
        double x = sc.nextInt();

        double L = ((sqrt(pow(E, x) - pow(cos(pow(x, 2) * pow(a, 5)), 4)) + pow(atan(a - pow(x, 5)), 4)) / pow(abs(a + x * pow(c, 4)), -E));
        System.out.println("\t\t\t\tВідповідь: L=" + L);

    }
}