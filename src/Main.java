public class Main {
    public static void main(String[] args) {
        // Начальный баланс клиента
        int initialBalance = 50;

        // Пополнение 1
        int topUp = 2000; // пополнение на 2000

        int bonusMiles = 0;

        // Условие для начисления бонусных миль
        if (topUp >= 1000) {
            bonusMiles = topUp / 100;
        }

        int totalBalance = initialBalance + topUp + bonusMiles;

        System.out.println("Бонусные мили: " + bonusMiles);
        System.out.println("Итоговый счет: " + totalBalance);
    }
}