import java.time.LocalDate;

public class Main {
    // Задание 1
    public static void isLeap(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
    // Задание 2
    public static void suggestInstall(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }   else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите  версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    // Задание 3

    public static int calculateDeliveryDays (int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        isLeap(2023);
        suggestInstall(0,2022);

        int deliveryDistance = 50;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}