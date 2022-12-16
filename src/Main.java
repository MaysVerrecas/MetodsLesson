import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введи год");
        task1(console.nextInt());

        System.out.println("Введи ОС ( 0 - Айфон, 1 - Андроид ) и год выпуска устройства");
        task2(console.nextInt(), console.nextInt());

        System.out.println("Введи кол-во км до клиента");
        task3(deliveryDays(console.nextInt()));

    }

    private static void task1(int console) {


        int year = console;

        System.out.println("TASK 1: ");
        isLeapYear(year);
        if (isLeapYear(year)) {
            System.out.println(String.format("Год %d - високосный", year));
        } else
        System.out.println(String.format("Год %d - невисокосный", year));
    }
    private static void task2(int clientOS, int clientDeviceYear) {
        System.out.println("TASK 2: ");
        downloadApp(clientOS, clientDeviceYear);
    }
    private static void task3(int deliveryDays) {
        System.out.println("TASK 3: ");

        if (deliveryDays < 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println(String.format("Для доставки понадобится %d дней", deliveryDays));
        }
    }

    private static boolean isLeapYear(int year) {
        /**
         * Реализуйте метод, который получает в качестве параметра год,
         * проверяет, является ли он високосным, и выводит результат в консоль.
         *
         * Эту проверку вы уже реализовывали в задании по условным операторам.
         */
        boolean isLeapYear = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }


    private static void downloadApp(int OS, int yearDevice) {
        int lossVersionYear = 2015;

        if (OS == 0) // пользователи яблок {
            if (yearDevice > lossVersionYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (OS == 1)  // пользователи ведра {
            if (yearDevice > lossVersionYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    private static int deliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else deliveryDays = -1;
        return deliveryDays;
    }
}