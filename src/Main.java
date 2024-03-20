public class Main {
    public static void main(String[] args) {

        //Task 1

        int clientOS = 0;
        boolean IOS = clientOS == 0;
        boolean Android = clientOS == 1;

        if (IOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }

        //Task 2

        int clientOS1 = 1;
        boolean IOS1 = clientOS1 == 0;
        boolean Android1 = clientOS1 == 1;
        int clientDeviceYear = 2015;

        if (IOS1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (IOS1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (Android1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (Android1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }

        //Task 3

        int year = 2021;
        System.out.println(year);
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4

        int deliveryDistance = 95;

        int deliveryTime1 = 1;
        int deliveryTime2 = 2;
        int deliveryTime3 = 3;


        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime1);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + deliveryTime2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryTime3);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Task 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это же зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это же весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это же лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это же осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}