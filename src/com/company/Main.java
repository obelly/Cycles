package com.company;

import java.util.Scanner;

public class Main {

    public static int countNumbers(int a) {
        int count = 0;
        while (a != 0) {
            a /= 10;
            count++;
        }

        return count;
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        task8();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int answer = 1;
        for (int i = 1; i <= B; i++) {
            answer *= A;
        }
        System.out.println("Answer = " + answer);
    } // Возвести число A в степень B
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (i % A == 0) {
                System.out.println(i);
            }
        }
    } // Вывести все числа от 1 до 1000, которые делятся на A.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        int A;
        do {
            A = scanner.nextInt();
        } while (A <= 0);
        int count = 0;
        for (int i = 1; i < Math.sqrt(A); i++) count++;
        System.out.println(count);
    } // Найдите количество положительных целых чисел, квадрат которых меньше A.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int divisor = 1;
        int maxDivisor = 0;
        while (divisor < a) {
            if (a % divisor == 0) {
                maxDivisor = divisor;
            }
            divisor++;
        }
        System.out.println("Наибольший делитель " + maxDivisor);
    } // Найти НОД.
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        if (a >= b) {
            for (int i = a; i >= b; i--) {
                if (i % 7 == 0) {
                    sum += i;
                    System.out.print(i + ",");

                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 7 == 0) {
                    sum += i;
                    System.out.print(i + ",");
                }
            }
        }
        System.out.print("\n" + "sum " + sum);
    } // Вывести сумму всех чисел из диапазона от A до B, которые делятся без остатка на 7.
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nF1 = 1;
        int a = 0;
        int b = 1;
        System.out.print("ряд Фибоначчи: " );
        if (n==1) {
          System.out.println(nF1);
        }
        System.out.print(" 1");
        for (int i = 2; i <= n; i++) {
            int z = a + b;
            a = b;
            b = z;
            System.out.print(" " + b);
        }
        System.out.println("\nN-ое число: " + b);
        // Ввести три условия
        //фибоначи 1 = 1, фибоначи 2 = 1, фибоначи = расчет

    } // Выведите N-ое число ряда Фибоначчи.
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println("НОД = " + (a + b));
    } //  Найти их наибольший общий делитель используя алгоритм Евклида.
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int div = a;
        int i;
        while (a < (Math.pow(div, 3))) {
            if (a == (Math.pow(div, 3))) {
                System.out.print("число N: " + div);
                break;
            }
            else {
                div = div / 2;
            }
        }
        for ( i = div; i<div*2 ; i++ ) {
            if (a == (Math.pow(i, 3))) {
                System.out.print("число N: " + i);
                break;
            }

        }
            if (a!=i*i*i) {
                System.out.println("Куб целого числа - дробное число");
        }


    } // Пользователь вводит целое положительное число, которое является кубом целого числа N. Найдите число N методом половинного деления.
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int countOdd = 0;
        int countEven = 0;
        while (a != 0) {
            if ((a % 10) % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
            a /= 10;
        }
        System.out.println(countOdd + " ");

    } //Найти количество нечетных цифр числа a.
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        int ost = a;

        while (a > 0) {
            ost = a % 10;
            a /= 10;
            b *= 10;
            b += ost;

        }

        System.out.println("Обратное число = " + b);
    } // Вывести зеркальное отображение последовательности цифр заданного числа
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a, b, evenN, oddN;
        a = 0;
        b = 0;
        System.out.print("Числа: ");
        for (int i = 1; i <= N; i++) {
            b = i;
            evenN = 0;
            oddN = 0;
            while (b != 0) {
                a = b % 10;
                if (a % 2 == 0) {
                    evenN += a;
                } else {
                    oddN += a;
                }
                b = b / 10;
            }
            if (evenN > oddN) {
                System.out.print(i + " ");
            }
        }
    }// Выведите числа в диапазоне от 1 до N, сумма четных цифр которых больше суммы нечетных.
    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ost, ost1;
        int match = 0;
        for (int i = 0; a!=0; i++) {
            ost = a % 10;
            a /= 10;
            int c = b;
            for (int j = 0; c != 0; j++) {
                ost1 = c % 10;
                c /= 10;
                if (ost == ost1) {
                    match++;
                }
            }
            if (match > 0) {
                System.out.println("ДА");
                break;
            }
        }
        if (match == 0) {
            System.out.println("НЕТ");
        }

    }// // Сообщите, есть ли в написании двух чисел одинаковые цифры.
    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 + (1.0 / (i * i));
        }
        System.out.println(sum);
    }// Дано натуральное n. Вычислить.
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        // Дано действительное число х, натуральное число n. Вычислить:
        //1)
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        double b = 1;
        double sum = 0;
        /* for (int i = 0; i <= n; i++) {
            b /= (x + i);
            sum += b;
        } */
        //2)
        for (int i = 1; i <= n; i++) {
            b *= (double) x /i;
            sum += b;
        }
        System.out.println(sum);

    } // Дано действительное число х, натуральное число n. Вычислить.
    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        //1)
        int n = scanner.nextInt();
        int fact = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum *= (double)3/fact;
        }
        //2)
        /* for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += (double) (1+i)/fact;
        } */
        System.out.println(sum);
    } // Дано натуральное n. Вычиcлить.
    public static void task16() {
        double fact = 1;
        // 1)
        /* double X = 1.6;
        for (int i = 2; fact <= X; i++){
            fact+=(double) 1/(i*i);
        } */
        // 2)
        /* double X = 0.75;
        for (int i = 2; fact <= X; i++) {
            fact+= (double) 1/((i-1)*(i+1));
        }*/
        // 3)
        Scanner scanner = new Scanner (System.in);
        double k = scanner.nextInt();
        double X = Math.pow (2.718, k);
        for (int i = 1; fact <= X; i++) {
            fact+=((Math.pow(k,i)/getFactorial(i)));
        }
        System.out.print(fact);
    }// Вычислить приближенно значение бесконечной суммы.
    public static void task17() {
        int sum = 0;
        int sumM = 0;
        int count = 0;
        // 1 условие
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 2 до 9");
        int multiplier = scanner.nextInt();
        for (int i = 10; i < 100; i++) {
            int A = i;
            while (A != 0) {
                sum += A % 10;
                A = A / 10;
            }
            int M = i * multiplier;
            while (M != 0) {
                sumM += M % 10;
                M /= 10;
            }
            if (sum == sumM) {
                System.out.print(i + ",");
            }
            sum = 0;
            sumM = 0;
        }
        // 2 условие
        /* System.out.println("Все двузначные числа, сумма цифр которых не меняется при умножении числа на 2-9: ");
        for (int i = 18; i < 100; i++) {
            int A = i;
            while (A != 0) {
                sum += A % 10;
                A = A / 10;
            }
            for (int j = 2; j <= 9; j++) {
                int M = i * j;
                while (M != 0) {
                    sumM += M % 10;
                    M = M / 10;
                }
            if (sum == sumM) {
                sumM = 0;
                count++;
            }
            else {
                break;
            }
        }
            if (count==8) {
                System.out.print(i + ",");
            }
            sum = 0;
            sumM = 0;
            count = 0;
        }*/
    }// Найти все двузначные числа, сумма цифр которых не меняется при умножении числа на 2,3,4,5,6,7,8,9.
    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            int n1 = i % 10;
            int n2 = i / 10 % 10;
            int n3 = i / 100;
            int sum = getFactorial(n1) + getFactorial(n2) + getFactorial(n3);
            if (sum == i) {
                System.out.print(i);
            }
        }
    } //Найти все трехзначные числа, представимые в виде сумм факториалов своих цифр.
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int m = Math.abs(scanner.nextInt());
        int a, b;
        boolean flag = false;
        for (int i = 1; i <= (Math.sqrt(m)); i++) {
            a = i * i;
            for (int j = 1; j <= (Math.sqrt(m)); j++) {
                b = j * j;
                if (m == (a + b)) {
                    System.out.println("Можно");
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }

        }
        if (!flag) {
            System.out.println("Нет");
        }

    } //Можно ли заданное натуральное число М представить в виде суммы квадратов двух натуральных чисел?
    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if (sum == N) {
            System.out.print("Заданное число-совершенное");
        } else {
            System.out.println("Заданное число не является совершенным");
        }
    } //Определить, является ли заданное число совершенным , т.е. равным сумме всех своих (положительных) делителей.
    public static void task21() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int length = 0;
        int i = 1;
        while (length < k) {
            System.out.println(i);
            length += countNumbers(i);
            i++;
        }
        System.out.println("\n" + (int) ((i - 1) / Math.pow(10, length - k)) % 10);
    } // Дано натуральное k. Напечатать k-ю цифру последовательности, в которой выписаны подряд все натуральные числа.
    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int length = 0;
        int i = 1;
        while (length < k) {
            System.out.println(i * i);
            length += countNumbers(i * i);
            i++;

        }
        System.out.println("\n" + (int) (((i - 1) * (i - 1)) / Math.pow(10, length - k)) % 10);

    }// Напечатать k-ю цифру последовательности, в которой выписаны подряд квадраты всех натуральных чисел.
    public static void task23() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("ряд Фибоначчи: \n" );
        int length = 0;
        while (length < k) {
            for (int i = 2; length <= k; i++) {
                int z = a + b;
                a = b;
                b = z;
                System.out.println(b);
            length += countNumbers(b);
            }
        b++;

        }
        System.out.print("\n" + (int) (b/(Math.pow(10, (length - k))) %10));

        }//Дано натуральное k. Напечатать k-ю цифру последовательности, в которой выписаны подряд все числа Фибоначчи.

}



