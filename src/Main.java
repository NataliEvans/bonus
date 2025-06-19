public class Main {
    public static void main(String[] args) {
        // Начальный баланс клиента
        int initialBalance = 50;

        // Пополнение 1
        int topUp = 2000; // пополнение на 2000

        // считаем бонус как целое деление суммы пополнений на 100
        int bonusMiles = topUp / 100;

        int totalBalance = initialBalance + topUp;

        System.out.println("Бонусные мили: " + bonusMiles);
        System.out.println("Итоговый счет: " + totalBalance);
    }
}