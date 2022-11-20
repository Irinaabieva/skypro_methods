public class Main {
    // Задание 1
    public static void isLeap(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
    public static void main(String[] args) {
        isLeap(2023);
    }
}